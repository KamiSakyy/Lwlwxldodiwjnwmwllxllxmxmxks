package kotlinx.serialization;

import no.a;

/* loaded from: /home/user/work/p/classes5.dex */
public final class UnknownFieldException extends SerializationException {
    public UnknownFieldException(int i) {
        super(a.k("An unknown field for index ", i));
    }
}
