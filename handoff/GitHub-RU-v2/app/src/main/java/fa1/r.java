package fa1;

/* loaded from: /home/user/work/p/classes5.dex */
public final class r extends s {
    public g d;
    public boolean e;

    public r(p0 p0Var, q81.d dVar, n nVar, g gVar, boolean z) {
        super(p0Var, dVar, nVar);
        this.d = gVar;
        this.e = z;
    }

    @Override // fa1.s
    public final Object a(z zVar, Object[] objArr) {
        e eVar = (e) this.d.c(zVar);
        a71.c cVar = (a71.c) objArr[objArr.length - 1];
        try {
            if (!this.e) {
                return x0.b(eVar, cVar);
            }
            k71.k.e(eVar, "null cannot be cast to non-null type retrofit2.Call<kotlin.Unit?>");
            return x0.c(eVar, cVar);
        } catch (LinkageError e) {
            throw e;
        } catch (ThreadDeath e2) {
            throw e2;
        } catch (VirtualMachineError e3) {
            throw e3;
        } catch (Throwable th) {
            x0.q(th, cVar);
            return b71.a.r;
        }
    }
}
