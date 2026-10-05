package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatServerSentEventFunctionCallStatus$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class l {
    public static final ChatServerSentEventFunctionCallStatus$Companion Companion;
    public static final Object r;
    public static final l s;
    public static final l t;
    public static final /* synthetic */ l[] u;

    static {
        l lVar = new l("STARTED", 0);
        l lVar2 = new l("ERROR", 1);
        l lVar3 = new l("COMPLETED", 2);
        s = lVar3;
        l lVar4 = new l("UNKNOWN", 3);
        t = lVar4;
        l[] lVarArr = {lVar, lVar2, lVar3, lVar4};
        u = lVarArr;
        l0.t(lVarArr);
        Companion = new ChatServerSentEventFunctionCallStatus$Companion();
        r = w.s(w61.i.r, new k(0));
    }

    public static l valueOf(String str) {
        return (l) Enum.valueOf(l.class, str);
    }

    public static l[] values() {
        return (l[]) u.clone();
    }
}
