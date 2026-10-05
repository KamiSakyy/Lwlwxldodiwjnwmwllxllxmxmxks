package wz0;

import ca1.f;
import ca1.g;
import ca1.j;
import com.github.service.models.response.type.DiffLineType;
import k71.k;
import sy.u;
import sy.w;
import v2.t;
import w61.p;
import w8.s;

/* loaded from: /home/user/work/p/classes4.dex */
public final class d {
    public static final p a = w.t(new wm.a(6));
    public static final p b = w.t(new wm.a(7));
    public static final p c = w.t(new wm.a(8));

    public static b a(DiffLineType diffLineType) {
        k.g(diffLineType, "diffLineType");
        int i = c.a[diffLineType.ordinal()];
        return i != 1 ? i != 2 ? (b) a.getValue() : (b) c.getValue() : (b) b.getValue();
    }

    public static e b(String str, b bVar, boolean z) {
        k.g(bVar, "spanParser");
        if (str == null || t71.p.T(str)) {
            return new e("", 0);
        }
        if (z) {
            str = f1.e.z("<span>", str, "</span>");
        }
        try {
            g k = u.k(str);
            f fVar = new f();
            fVar.t = false;
            k.getClass();
            k.A = fVar;
            j K = k.K();
            k71.u uVar = new k71.u();
            s.K(new t(13, uVar, bVar), K);
            String I = K.I();
            k.f(I, "html(...)");
            return new e(t71.w.C(I, "\n", "<br/>"), uVar.r);
        } catch (Exception unused) {
            return new e(t71.w.C(str, "\n", "<br/>"), str.length());
        }
    }

    public static e c(String str, int i) {
        return b(str, (b) a.getValue(), (i & 4) == 0);
    }
}
