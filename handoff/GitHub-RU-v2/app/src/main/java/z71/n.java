package z71;

import java.util.concurrent.atomic.AtomicInteger;
import v71.b0;
import w61.a0;

/* loaded from: /home/user/work/p/classes5.dex */
public final class n extends c71.j implements j71.e {
    public /* synthetic */ Object A;
    public final /* synthetic */ y71.i[] B;
    public final /* synthetic */ j71.a C;
    public final /* synthetic */ c71.j D;
    public final /* synthetic */ y71.j E;
    public x71.l v;
    public byte[] w;
    public int x;
    public int y;
    public int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(a71.c cVar, j71.a aVar, j71.f fVar, y71.j jVar, y71.i[] iVarArr) {
        super(2, cVar);
        this.B = iVarArr;
        this.C = aVar;
        this.D = (c71.j) fVar;
        this.E = jVar;
    }

    public final a71.c r(a71.c cVar, Object obj) {
        n nVar = new n(cVar, this.C, this.D, this.E, this.B);
        nVar.A = obj;
        return nVar;
    }

    public final Object s(Object obj, Object obj2) {
        return r((a71.c) obj2, (v71.z) obj).v(a0.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0097, code lost:
    
        if (r12 == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00e4, code lost:
    
        if (r14.f(r13, r9, r20) == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00fc, code lost:
    
        if (r14.f(r13, r12, r20) == r2) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
    
        if (r8 != 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00fe, code lost:
    
        return r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00a5 A[LOOP_START, PHI: r8 r12
      0x00a5: PHI (r8v3 int) = (r8v2 int), (r8v4 int) binds: [B:13:0x00a0, B:31:?] A[DONT_GENERATE, DONT_INLINE]
      0x00a5: PHI (r12v4 x61.u) = (r12v3 x61.u), (r12v10 x61.u) binds: [B:13:0x00a0, B:31:?] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r3v6, types: [int] */
    /* JADX WARN: Type inference failed for: r3v8, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00e4 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x00fc -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object v(Object obj) {
        int length;
        Object[] objArr;
        byte[] bArr;
        byte b;
        x71.l lVar;
        Object obj2;
        a81.t tVar = b.c;
        b71.a aVar = b71.a.r;
        int i = this.z;
        if (i == 0) {
            sy.y.j(obj);
            v71.z zVar = (v71.z) this.A;
            length = this.B.length;
            if (length != 0) {
                objArr = new Object[length];
                x61.l.G(0, length, tVar, objArr);
                x71.h a = t.e.a(length, 6, (x71.a) null);
                AtomicInteger atomicInteger = new AtomicInteger(length);
                for (int i2 = 0; i2 < length; i2++) {
                    b0.z(zVar, null, null, new dn.c(this.B, i2, atomicInteger, a, (a71.c) null, 4), 3);
                }
                bArr = new byte[length];
                b = 0;
                lVar = a;
            }
            return a0.a;
        }
        if (i == 1) {
            int r3 = this.y;
            length = this.x;
            byte[] bArr2 = this.w;
            lVar = this.v;
            Object[] objArr2 = (Object[]) this.A;
            sy.y.j(obj);
            obj2 = ((x71.o) obj).a;
            b = r3;
            bArr = bArr2;
            objArr = objArr2;
            x61.u uVar = (x61.u) x71.o.b(obj2);
            if (uVar != null) {
                while (true) {
                    int i3 = uVar.a;
                    Object obj3 = objArr[i3];
                    objArr[i3] = uVar.b;
                    if (obj3 == tVar) {
                        length--;
                    }
                    if (bArr[i3] != b) {
                        bArr[i3] = b;
                        uVar = (x61.u) x71.o.b(lVar.c());
                        if (uVar != null) {
                        }
                    }
                    if (length == 0) {
                        Object[] objArr3 = (Object[]) this.C.a();
                        y71.j jVar = this.E;
                        c71.j jVar2 = this.D;
                        if (objArr3 == null) {
                            this.A = objArr;
                            this.v = lVar;
                            this.w = bArr;
                            this.x = length;
                            this.y = b;
                            this.z = 2;
                        } else {
                            x61.l.B(0, 0, 14, objArr, objArr3);
                            this.A = objArr;
                            this.v = lVar;
                            this.w = bArr;
                            this.x = length;
                            this.y = b;
                            this.z = 3;
                        }
                        x61.u uVar2 = (x61.u) x71.o.b(obj2);
                        if (uVar2 != null) {
                        }
                    }
                }
            }
            return a0.a;
        }
        if (i != 2 && i != 3) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int r32 = this.y;
        length = this.x;
        byte[] bArr3 = this.w;
        lVar = this.v;
        Object[] objArr4 = (Object[]) this.A;
        sy.y.j(obj);
        b = r32;
        bArr = bArr3;
        objArr = objArr4;
        b = (byte) (b + 1);
        this.A = objArr;
        this.v = lVar;
        this.w = bArr;
        this.x = length;
        this.y = b;
        this.z = 1;
        obj2 = lVar.a(this);
    }
}
