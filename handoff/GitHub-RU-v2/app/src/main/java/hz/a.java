package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatClientConfirmationStateResponse$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class a {
    public static final ChatClientConfirmationStateResponse$Companion Companion;
    public static final Object r;
    public static final a s;
    public static final a t;
    public static final a u;
    public static final /* synthetic */ a[] v;

    static {
        a aVar = new a("ACCEPTED", 0);
        s = aVar;
        a aVar2 = new a("DISMISSED", 1);
        t = aVar2;
        a aVar3 = new a("UNKNOWN", 2);
        u = aVar3;
        a[] aVarArr = {aVar, aVar2, aVar3};
        v = aVarArr;
        l0.t(aVarArr);
        Companion = new ChatClientConfirmationStateResponse$Companion();
        r = w.s(w61.i.r, new gz.a(25));
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) v.clone();
    }
}
