package v71;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class v extends a71.a implements a71.e {
    public static final u s = new u(a71.d.r, new v00.n(5));

    public v() {
        super(a71.d.r);
    }

    public abstract void J0(a71.h hVar, Runnable runnable);

    public void K0(a71.h hVar, Runnable runnable) {
        a81.bShadow.i(this, hVar, runnable);
    }

    public boolean L0(a71.h hVar) {
        return !(this instanceof x1);
    }

    public v M0(int i) {
        a81.bShadow.a(i);
        return new a81.g(this, i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
    
        if (((a71.f) r3.r.k(r2)) == null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0029, code lost:
    
        return a71.i.r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (a71.d.r == r3) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final a71.h b0(a71.g gVar) {
        k71.k.g(gVar, "key");
        if (gVar instanceof u) {
            u uVar = (u) gVar;
            a71.g gVar2 = ((a71.a) this).r;
            k71.k.g(gVar2, "key");
            if (gVar2 != uVar) {
                if (uVar.s != gVar2) {
                    return this;
                }
            }
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + b0.q(this);
    }

    public final a71.f w0(a71.g gVar) {
        a71.f fVar;
        k71.k.g(gVar, "key");
        if (gVar instanceof u) {
            u uVar = (u) gVar;
            a71.g gVar2 = ((a71.a) this).r;
            k71.k.g(gVar2, "key");
            if ((gVar2 == uVar || uVar.s == gVar2) && (fVar = (a71.f) uVar.r.k(this)) != null) {
                return fVar;
            }
        } else if (a71.d.r == gVar) {
            return this;
        }
        return null;
    }
    public i b(Object p1, Object p2) { return null; }
    public v(String p1, String p2, Object p3, String p4, Object p5, int p6) {
    }
}
