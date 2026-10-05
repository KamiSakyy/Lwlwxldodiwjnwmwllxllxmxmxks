package c3;

import h3.n;
import h3.q;
import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f4097a;

    /* renamed from: b, reason: collision with root package name */
    public float f4098b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f4099c;

    public g(int i, c cVar) {
        this.f4097a = i;
        this.f4099c = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public float a(int i, boolean z10, boolean z11, boolean z12) {
        boolean z13;
        int i10;
        q qVar = (q) this.f4099c;
        int i11 = 1;
        if (z10) {
            int d10 = n.d(qVar.f25477f, i, z10);
            int lineStart = qVar.f25477f.getLineStart(d10);
            int f6 = qVar.f(d10);
            if (i == lineStart || i == f6) {
                z13 = true;
                int i12 = i * 4;
                if (z12) {
                    i11 = z13 ? 2 : 3;
                } else if (z13) {
                    i11 = 0;
                }
                i10 = i12 + i11;
                if (this.f4097a != i10) {
                    return this.f4098b;
                }
                float h10 = z12 ? qVar.h(i, z10) : qVar.i(i, z10);
                if (z11) {
                    this.f4097a = i10;
                    this.f4098b = h10;
                }
                return h10;
            }
        }
        z13 = false;
        int i122 = i * 4;
        if (z12) {
        }
        i10 = i122 + i11;
        if (this.f4097a != i10) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object b(float f6, c71.c cVar) {
        f fVar;
        int i;
        if (cVar instanceof f) {
            fVar = (f) cVar;
            int i10 = fVar.f4096w;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f4096w = i10 - Integer.MIN_VALUE;
                Object obj = fVar.f4094u;
                b71.a aVar = b71.a.r;
                i = fVar.f4096w;
                if (i != 0) {
                    y.j(obj);
                    c cVar2 = (c) this.f4099c;
                    Float f10 = new Float(f6);
                    fVar.f4096w = 1;
                    obj = cVar2.s(f10, fVar);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    y.j(obj);
                }
                this.f4098b += ((Number) obj).floatValue();
                return a0.a;
            }
        }
        fVar = new f(this, cVar);
        Object obj2 = fVar.f4094u;
        b71.a aVar2 = b71.a.r;
        i = fVar.f4096w;
        if (i != 0) {
        }
        this.f4098b += ((Number) obj2).floatValue();
        return a0.a;
    }

    public g(q qVar) {
        this.f4099c = qVar;
        this.f4097a = -1;
    }






}
