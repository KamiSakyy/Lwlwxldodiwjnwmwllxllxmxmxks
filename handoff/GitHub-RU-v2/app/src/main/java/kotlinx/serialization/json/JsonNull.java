package kotlinx.serialization.json;

import g81.e;
import kotlinx.serialization.KSerializer;
import l81.r;

@e(with = r.class)
/* loaded from: /home/user/work/p/classes5.dex */
public final class JsonNull extends d {
    public static final JsonNull INSTANCE = new JsonNull();

    @Override // kotlinx.serialization.json.d
    public final String a() {
        return "null";
    }

    @Override // kotlinx.serialization.json.d
    public final boolean b() {
        return false;
    }

    public final KSerializer serializer() {
        return r.a;
    }
}
