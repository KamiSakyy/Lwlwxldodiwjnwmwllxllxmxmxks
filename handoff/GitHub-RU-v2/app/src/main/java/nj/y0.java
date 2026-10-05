package nj;

import java.util.Collection;
import java.util.LinkedHashMap;
import l7.z1;
import xn.i3;
import xn.k3;
import xn.v2;
import y71.m1;

/* loaded from: /home/user/work/p/classes3.dex */
public final class y0 {
    public static final t0 Companion = new t0();
    public final m1 a = w8.s.j();
    public final z1 b = new z1(8);

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0094, code lost:
    
        if (r1 != null) goto L50;
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x000d, B:6:0x0019, B:7:0x0024, B:8:0x002f, B:10:0x0036, B:18:0x004c, B:22:0x0055, B:23:0x0059, B:25:0x0061, B:26:0x0063, B:30:0x0070, B:33:0x0078, B:38:0x0084, B:43:0x0090, B:46:0x0096, B:47:0x009e, B:67:0x001f), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0090 A[Catch: all -> 0x001c, TryCatch #0 {all -> 0x001c, blocks: (B:4:0x000d, B:6:0x0019, B:7:0x0024, B:8:0x002f, B:10:0x0036, B:18:0x004c, B:22:0x0055, B:23:0x0059, B:25:0x0061, B:26:0x0063, B:30:0x0070, B:33:0x0078, B:38:0x0084, B:43:0x0090, B:46:0x0096, B:47:0x009e, B:67:0x001f), top: B:3:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0087  */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(String str, v2 v2Var) {
        u0 u0Var;
        LinkedHashMap linkedHashMap;
        boolean z;
        int max;
        boolean z2;
        boolean z3;
        boolean z4;
        k71.k.g(str, "taskId");
        k71.k.g(v2Var, "page");
        synchronized (this.b) {
            try {
                u0Var = (u0) this.b.h(str);
                linkedHashMap = new LinkedHashMap(u0Var != null ? u0Var.a : new LinkedHashMap());
                z = false;
                for (i3 i3Var : v2Var.a) {
                    if (!k71.k.b((i3) linkedHashMap.put(i3Var.a, i3Var), i3Var)) {
                        z = true;
                    }
                }
                if (m7.y.h(linkedHashMap)) {
                    z = true;
                }
                int i = u0Var != null ? u0Var.b : 1;
                boolean a = v2Var.a();
                int i2 = v2Var.b;
                if (a) {
                    i2++;
                }
                max = Math.max(i, i2);
                z2 = v2Var.b >= i;
            } catch (Throwable th2) {
                throw th2;
            }
            if (!(u0Var != null ? u0Var.c : false) && (!z2 || v2Var.a())) {
                z3 = false;
                z4 = z3 == (u0Var == null ? u0Var.c : false);
                Integer num = null;
                if (z2) {
                    if (u0Var != null) {
                        num = u0Var.d;
                    }
                } else {
                    Integer num2 = v2Var.d;
                    if (num2 != null) {
                        num = num2;
                    }
                }
                throw th2;
            }
            z3 = true;
            if (z3 == (u0Var == null ? u0Var.c : false)) {
            }
            Integer num3 = null;
            if (z2) {
            }
            throw th2;
        }
        if (z || z4) {
            this.a.m(str);
        }
        return z || z4;
    }

    public final v0 b(String str) {
        v0 v0Var;
        k71.k.g(str, "taskId");
        synchronized (this.b) {
            u0 u0Var = (u0) this.b.h(str);
            v0Var = u0Var != null ? new v0(u0Var.b, u0Var.c, u0Var.d) : null;
        }
        return v0Var;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.lang.Object, java.util.List] */
    public final void c(String str, v2 v2Var) {
        k71.k.g(str, "taskId");
        k71.k.g(v2Var, "page");
        if (v2Var.b != 1) {
            return;
        }
        synchronized (this.b) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap(v2Var.a.size());
                for (i3 i3Var : v2Var.a) {
                    linkedHashMap.put(i3Var.a, i3Var);
                }
                m7.y.h(linkedHashMap);
                z1 z1Var = this.b;
                boolean a = v2Var.a();
                int i = v2Var.b;
                if (a) {
                    i++;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        this.a.m(str);
    }

    public final k3 d(String str) {
        k3 k3Var;
        k71.k.g(str, "taskId");
        synchronized (this.b) {
            u0 u0Var = (u0) this.b.h(str);
            if (u0Var != null) {
                Collection values = u0Var.a.values();
                k71.k.f(values, "<get-values>(...)");
                k3Var = new k3(x61.m.F0(values), u0Var.c);
            } else {
                k3Var = null;
            }
        }
        return k3Var;
    }
}
