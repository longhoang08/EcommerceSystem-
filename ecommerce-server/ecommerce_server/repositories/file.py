# coding=utf-8
import logging

__author__ = 'LongHB'

import requests
from werkzeug.datastructures import MultiDict

from config import IMG_CLIENT_ID

_logger = logging.getLogger(__name__)


def upload_image(images: MultiDict) -> str:
    headers = {'Authorization': 'Client-ID ' + IMG_CLIENT_ID}
    r = requests.post('https://api.imgur.com/3/upload', headers=headers, files=images)
    response = r.json()
    return response.get('data').get('link')
