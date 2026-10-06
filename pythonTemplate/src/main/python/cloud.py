"""Explicitly disabled cloud endpoints for the bundled Android Flask profile."""
from flask import Blueprint, jsonify

cloud_bp = Blueprint("cloud", __name__)


@cloud_bp.route("/", defaults={"path": ""}, methods=["GET", "POST", "PUT", "PATCH", "DELETE"])
@cloud_bp.route("/<path:path>", methods=["GET", "POST", "PUT", "PATCH", "DELETE"])
def cloud_disabled(path):
    return jsonify({
        "error": "Cloud storage is disabled in this Android build.",
        "available": False,
    }), 501
