package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceOwnerTypeResponse$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class d {
    public static final ChatMessageReferenceOwnerTypeResponse$Companion Companion;
    public static final Object r;
    public static final d s;
    public static final d t;
    public static final d u;
    public static final /* synthetic */ d[] v;

    static {
        d dVar = new d("ORGANIZATION", 0);
        s = dVar;
        d dVar2 = new d("USER", 1);
        t = dVar2;
        d dVar3 = new d("UNKNOWN", 2);
        u = dVar3;
        d[] dVarArr = {dVar, dVar2, dVar3};
        v = dVarArr;
        l0.t(dVarArr);
        Companion = new ChatMessageReferenceOwnerTypeResponse$Companion();
        r = w.s(w61.i.r, new gz.a(29));
    }

    public static d valueOf(String str) {
        return (d) Enum.valueOf(d.class, str);
    }

    public static d[] values() {
        return (d[]) v.clone();
    }
}
