package kotlinx.serialization.json.internal;

import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class JsonEncodingException extends JsonException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JsonEncodingException(String str) {
        super(str);
        k.g(str, "message");
    }
}
