package ep;

import java.util.List;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class jo implements aa.a {
    public static final List a = x61.l.r(new String[]{"repositories", "id"});

    public static jo.bz c(ea.e eVar, aa.w wVar) {
        k71.k.g(eVar, "reader");
        k71.k.g(wVar, "customScalarAdapters");
        jo.fz fzVar = null;
        String str = null;
        while (true) {
            int r0 = eVar.r0(a);
            if (r0 == 0) {
                fzVar = (jo.fz) aa.c.c(no.a, false).a(eVar, wVar);
            } else {
                if (r0 != 1) {
                    break;
                }
                str = (String) aa.c.a.a(eVar, wVar);
            }
        }
        if (fzVar == null) {
            k41.b.B(eVar, "repositories");
            throw null;
        }
        if (str != null) {
            return new jo.bz(fzVar, str);
        }
        k41.b.B(eVar, "id");
        throw null;
    }

    public static void d(ea.f fVar, aa.w wVar, jo.bz bzVar) {
        k71.k.g(fVar, "writer");
        k71.k.g(wVar, "customScalarAdapters");
        k71.k.g(bzVar, "value");
        fVar.z0("repositories");
        aa.c.c(no.a, false).b(fVar, wVar, bzVar.a);
        fVar.z0("id");
        aa.c.a.b(fVar, wVar, bzVar.b);
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ak<T1,T2,T3,T4> {
        public ak() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class as<T1,T2,T3,T4> {
        public as() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class bz<T1,T2,T3,T4> {
        public bz() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class cz<T1,T2,T3,T4> {
        public cz() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class d3<T1,T2,T3,T4> {
        public d3() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class dh<T1,T2,T3,T4> {
        public dh() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class dt<T1,T2,T3,T4> {
        public dt() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class e3<T1,T2,T3,T4> {
        public e3() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class eh<T1,T2,T3,T4> {
        public eh() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class f3<T1,T2,T3,T4> {
        public f3() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class g3<T1,T2,T3,T4> {
        public g3() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class gc<T1,T2,T3,T4> {
        public gc() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class gn<T1,T2,T3,T4> {
        public gn() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class gu<T1,T2,T3,T4> {
        public gu() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class h3<T1,T2,T3,T4> {
        public h3() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ho<T1,T2,T3,T4> {
        public ho() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class hu<T1,T2,T3,T4> {
        public hu() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class hx<T1,T2,T3,T4> {
        public hx() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ln<T1,T2,T3,T4> {
        public ln() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ly<T1,T2,T3,T4> {
        public ly() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class og<T1,T2,T3,T4> {
        public og() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class oh<T1,T2,T3,T4> {
        public oh() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class oo<T1,T2,T3,T4> {
        public oo() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class q6<T1,T2,T3,T4> {
        public q6() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class qx<T1,T2,T3,T4> {
        public qx() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r4<T1,T2,T3,T4> {
        public r4() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class r6<T1,T2,T3,T4> {
        public r6() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ri<T1,T2,T3,T4> {
        public ri() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class rp<T1,T2,T3,T4> {
        public rp() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s4<T1,T2,T3,T4> {
        public s4() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class s6<T1,T2,T3,T4> {
        public s6() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class si<T1,T2,T3,T4> {
        public si() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class t4<T1,T2,T3,T4> {
        public t4() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ti<T1,T2,T3,T4> {
        public ti() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ty<T1,T2,T3,T4> {
        public ty() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ui<T1,T2,T3,T4> {
        public ui() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class va<T1,T2,T3,T4> {
        public va() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class vi<T1,T2,T3,T4> {
        public vi() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class wf<T1,T2,T3,T4> {
        public wf() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class wg<T1,T2,T3,T4> {
        public wg() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ww<T1,T2,T3,T4> {
        public ww() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class xc<T1,T2,T3,T4> {
        public xc() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class xf<T1,T2,T3,T4> {
        public xf() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class xm<T1,T2,T3,T4> {
        public xm() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class yf<T1,T2,T3,T4> {
        public yf() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class ym<T1,T2,T3,T4> {
        public ym() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class yr<T1,T2,T3,T4> {
        public yr() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class zm<T1,T2,T3,T4> {
        public zm() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class zn<T1,T2,T3,T4> {
        public zn() {
        }
    }

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class zr<T1,T2,T3,T4> {
        public zr() {
        }
    }
}
