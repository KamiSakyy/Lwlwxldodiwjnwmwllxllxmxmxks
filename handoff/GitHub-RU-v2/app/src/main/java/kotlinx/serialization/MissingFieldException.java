package kotlinx.serialization;

import java.util.List;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class MissingFieldException extends SerializationException {
    public List r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MissingFieldException(List list, String str, MissingFieldException missingFieldException) {
        super(str, missingFieldException);
        k.g(list, "missingFields");
        this.r = list;
    }
}
