# coding=utf-8
import logging

from app.helpers.catalog.product_utils import Utilities
from app.repositories.es.product import ProductElasticRepo

__author__ = 'LongHB'
_logger = logging.getLogger(__name__)


def find_by_sku(sku: str):
    product_es = ProductElasticRepo()
    responses = product_es.search({'skus': [sku]})
    if not responses: return []
    hits = responses['hits']['hits']
    products = [item['_source'] for item in hits]
    return products


def get_result_search(args):
    args = Utilities.reformat_product_search_params(args)
    product_es = ProductElasticRepo()
    response = product_es.search(args)
    return extract_product_data_from_response(response)


def extract_product_data_from_response(responses):
    if not responses:
        return {'data': {'products': []}}
    hits = responses['hits']['hits']
    products = [item['_source'] for item in hits]
    return {'data': {'products': products}}
