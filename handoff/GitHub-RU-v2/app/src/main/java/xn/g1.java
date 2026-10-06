package xn;

import com.github.service.copilot.ElicitationAction$Companion;
import java.util.LinkedHashMap;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@g81.e
/* loaded from: /home/user/work/p/classes3.dex */
public final class g1 {
    public static final ElicitationAction$Companion Companion;
    public static final LinkedHashMap s;
    public static final Object t;
    public static final g1 u;
    public static final g1 v;
    public static final /* synthetic */ g1[] w;
    public String r;

    static {
        g1 g1Var = new g1("ACCEPT", 0, "accept");
        u = g1Var;
        g1 g1Var2 = new g1("DECLINE", 1, "decline");
        v = g1Var2;
        g1[] g1VarArr = {g1Var, g1Var2, new g1("CANCEL", 2, "cancel")};
        w = g1VarArr;
        d71.b t2 = v8.l0.t(g1VarArr);
        Companion = new ElicitationAction$Companion();
        int s2 = x61.x.s(x61.n.F(t2, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(s2 < 16 ? 16 : s2);
        a5.g1 g1Var3 = new a5.g1(8, t2);
        while (g1Var3.hasNext()) {
            Object next = g1Var3.next();
            linkedHashMap.put(((g1) next).r, next);
        }
        s = linkedHashMap;
        t = sy.w.s(w61.i.r, new wm.a(14));
    }

    public g1(String str, int i, String str2) {
        this.r = str2;
    }

    public static g1 valueOf(String str) {
        return (g1) Enum.valueOf(g1.class, str);
    }

    public static g1[] values() {
        return (g1[]) w.clone();
    }
}
