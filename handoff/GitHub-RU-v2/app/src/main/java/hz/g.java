package hz;

import com.github.service.dotcom.models.response.copilot.serialization.ChatMessageReferenceVisibilityResponse$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final ChatMessageReferenceVisibilityResponse$Companion Companion;
    public static final Object r;
    public static final g s;
    public static final g t;
    public static final g u;
    public static final /* synthetic */ g[] v;

    static {
        g gVar = new g("PUBLIC", 0);
        s = gVar;
        g gVar2 = new g("PRIVATE", 1);
        t = gVar2;
        g gVar3 = new g("UNKNOWN", 2);
        u = gVar3;
        g[] gVarArr = {gVar, gVar2, gVar3};
        v = gVarArr;
        l0.t(gVarArr);
        Companion = new ChatMessageReferenceVisibilityResponse$Companion();
        r = w.s(w61.i.r, new e(8));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) v.clone();
    }
}
