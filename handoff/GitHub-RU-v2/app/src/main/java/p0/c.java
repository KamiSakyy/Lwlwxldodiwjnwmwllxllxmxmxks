package p0;

import sy.y;
import w61.a0;

/* loaded from: /home/user/work/p/classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final l1.e f30326a = new l1.e(new e[16]);

    /* JADX WARN: Removed duplicated region for block: B:12:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0063 -> B:10:0x0066). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(c2.c cVar, c71.c cVar2) {
        b bVar;
        int i;
        c2.c cVar3;
        int i10;
        Object[] objArr;
        int i11;
        if (cVar2 instanceof b) {
            bVar = (b) cVar2;
            int i12 = bVar.A;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                bVar.A = i12 - Integer.MIN_VALUE;
                Object obj = bVar.f30324y;
                b71.a aVar = b71.a.r;
                i = bVar.A;
                if (i != 0) {
                    y.j(obj);
                    l1.e eVar = this.f30326a;
                    Object[] objArr2 = eVar.f27901r;
                    int i13 = eVar.f27903t;
                    cVar3 = cVar;
                    i10 = i13;
                    objArr = objArr2;
                    i11 = 0;
                    if (i11 < i10) {
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i10 = bVar.f30323x;
                    i11 = bVar.f30322w;
                    objArr = bVar.f30321v;
                    c2.c cVar4 = bVar.f30320u;
                    y.j(obj);
                    cVar3 = cVar4;
                    i11++;
                    if (i11 < i10) {
                        e eVar2 = (e) objArr[i11];
                        ma.a aVar2 = new ma.a(8, cVar3);
                        bVar.f30320u = cVar3;
                        bVar.f30321v = objArr;
                        bVar.f30322w = i11;
                        bVar.f30323x = i10;
                        bVar.A = 1;
                        if (aa1.b.o(eVar2, aVar2, bVar) == aVar) {
                            return aVar;
                        }
                        i11++;
                        if (i11 < i10) {
                            return a0.a;
                        }
                    }
                }
            }
        }
        bVar = new b(this, cVar2);
        Object obj2 = bVar.f30324y;
        b71.a aVar3 = b71.a.r;
        i = bVar.A;
        if (i != 0) {
        }
    }
}
