package da1;

import java.util.HashMap;
import java.util.Map;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b0 {
    public static final c A;
    public static final d B;
    public static final e C;
    public static final f D;
    public static final g E;
    public static final h F;
    public static final i G;
    public static final j H;
    public static final k I;
    public static final l J;
    public static final n K;
    public static final o L;
    public static final p M;
    public static final q N;
    public static final r O;
    public static final String P;
    public static final /* synthetic */ b0[] Q;
    public static final m r;
    public static final s s;
    public static final t t;
    public static final u u;
    public static final v v;
    public static final w w;
    public static final x x;
    public static final y y;
    public static final z z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [da1.m] */
    static {
        b0 r0 = new b0() { // from class: da1.m;
            @Override // da1.b0
            public final boolean d(s0 s0Var, b bVar) {
                if (b0.a(s0Var)) {
                    return true;
                }
                if (s0Var.a()) {
                    bVar.v((l0) s0Var);
                    return true;
                }
                boolean b = s0Var.b();
                s sVar = b0.s;
                if (!b) {
                    bVar.d.C = 2;
                    bVar.l = sVar;
                    return bVar.H(s0Var);
                }
                m0 m0Var = (m0) s0Var;
                e0 e0Var = bVar.h;
                String G2 = m0Var.d.G();
                e0Var.getClass();
                String trim = G2.trim();
                if (!e0Var.a) {
                    trim = ba1.a.c(trim);
                }
                String G3 = m0Var.f.G();
                String G4 = m0Var.g.G();
                ca1.h hVar = new ca1.h(trim);
                aa1.b.K(G3);
                aa1.b.K(G4);
                ca1.b d = hVar.d();
                d.a("name", trim);
                d.a("publicId", G3);
                d.a("systemId", G4);
                if (hVar.H("publicId")) {
                    hVar.d().a("pubSysKey", "PUBLIC");
                } else if (hVar.H("systemId")) {
                    hVar.d().a("pubSysKey", "SYSTEM");
                }
                String str = m0Var.e;
                if (str != null) {
                    hVar.D("pubSysKey", str);
                }
                bVar.d.D(hVar);
                if (m0Var.h || !hVar.b("name").equals("html") || hVar.b("publicId").equalsIgnoreCase("HTML")) {
                    bVar.d.C = 2;
                }
                bVar.l = sVar;
                return true;
            }
        };
        r = r0;
        s sVar = new s();
        s = sVar;
        t tVar = new t();
        t = tVar;
        u uVar = new u();
        u = uVar;
        v vVar = new v();
        v = vVar;
        w wVar = new w();
        w = wVar;
        x xVar = new x();
        x = xVar;
        y yVar = new y();
        y = yVar;
        z zVar = new z();
        z = zVar;
        c cVar = new c();
        A = cVar;
        d dVar = new d();
        B = dVar;
        e eVar = new e();
        C = eVar;
        f fVar = new f();
        D = fVar;
        g gVar = new g();
        E = gVar;
        h hVar = new h();
        F = hVar;
        i iVar = new i();
        G = iVar;
        j jVar = new j();
        H = jVar;
        k kVar = new k();
        I = kVar;
        l lVar = new l();
        J = lVar;
        n nVar = new n();
        K = nVar;
        o oVar = new o();
        L = oVar;
        p pVar = new p();
        M = pVar;
        q qVar = new q();
        N = qVar;
        r rVar = new r();
        O = rVar;
        Q = new b0[]{r0, sVar, tVar, uVar, vVar, wVar, xVar, yVar, zVar, cVar, dVar, eVar, fVar, gVar, hVar, iVar, jVar, kVar, lVar, nVar, oVar, pVar, qVar, rVar};
        P = String.valueOf((char) 0);
    }

    public static boolean a(s0 s0Var) {
        if (s0Var.a == 5) {
            return ba1.h.e(((k0) s0Var).d.G());
        }
        return false;
    }

    public static void b(p0 p0Var, b bVar, l3 l3Var) {
        if (l3Var != null) {
            bVar.c.o(l3Var);
        }
        bVar.m = bVar.l;
        bVar.l = y;
        bVar.w(p0Var);
    }

    public static void c(p0 p0Var, ca1.j jVar) {
        Object obj;
        Map map;
        ca1.b bVar = p0Var.g;
        if (bVar != null) {
            bVar.getClass();
            androidx.datastore.preferences.protobuf.d dVar = new androidx.datastore.preferences.protobuf.d(bVar);
            while (dVar.hasNext()) {
                ca1.a aVar = (ca1.a) dVar.next();
                String str = aVar.r;
                ca1.b d = jVar.d();
                if (d.i(str) == -1) {
                    ca1.b bVar2 = aVar.t;
                    if (bVar2 == null) {
                        int i = ca1.r.c;
                    } else if (bVar2.i(str) != -1) {
                        if (bVar2.i("/jsoup.userdata") != -1) {
                            int i2 = bVar2.i("/jsoup.userdata");
                            if (i2 == -1) {
                                HashMap hashMap = new HashMap();
                                bVar2.a("/jsoup.userdata", hashMap);
                                map = hashMap;
                            } else {
                                map = (Map) bVar2.t[i2];
                            }
                            obj = map.get("jsoup.attrs");
                        } else {
                            obj = null;
                        }
                        Map map2 = (Map) obj;
                        if (map2 == null) {
                            int i3 = ca1.r.c;
                        } else if (((ca1.r) map2.get(str)) == null) {
                            int i4 = ca1.r.c;
                        }
                    } else {
                        int i5 = ca1.r.c;
                    }
                    String str2 = aVar.s;
                    if (str2 == null) {
                        str2 = "";
                    }
                    d.l(str, str2);
                    aVar.t = d;
                }
            }
        }
    }

    public static b0 valueOf(String str) {
        return (b0) Enum.valueOf(b0.class, str);
    }

    public static b0[] values() {
        return (b0[]) Q.clone();
    }

    public abstract boolean d(s0 s0Var, b bVar);



}
