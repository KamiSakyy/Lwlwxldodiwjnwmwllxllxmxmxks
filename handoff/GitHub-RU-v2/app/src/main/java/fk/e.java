package fk;

import com.github.domain.database.serialization.FilterNonPersistedKey$Companion;
import f1.u5;
import sy.w;

@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public abstract class e implements f {
    public static final FilterNonPersistedKey$Companion Companion = new FilterNonPersistedKey$Companion();
    public static final Object r = w.s(w61.i.r, new u5(12));

    @Override // fk.f
    public final String getKey() {
        return "PersistenceKeyEphemeral";
    }
}
