package on;

import com.github.service.agents.CopilotAgentTaskOrder$Companion;
import sy.w;
import v8.l0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class g {
    public static final CopilotAgentTaskOrder$Companion Companion;
    public static final Object r;
    public static final g s;
    public static final g t;
    public static final /* synthetic */ g[] u;
    public static final /* synthetic */ d71.b v;

    static {
        h[] hVarArr = h.r;
        v01.a aVar = v01.a.r;
        g gVar = new g("MostRecentUpdate", 0);
        s = gVar;
        g gVar2 = new g("LeastRecentUpdate", 1);
        t = gVar2;
        g[] gVarArr = {gVar, gVar2};
        u = gVarArr;
        v = l0.t(gVarArr);
        Companion = new CopilotAgentTaskOrder$Companion();
        r = w.s(w61.i.r, new kh.a(27));
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) u.clone();
    }

    public g(Object... a) {
    }
}
