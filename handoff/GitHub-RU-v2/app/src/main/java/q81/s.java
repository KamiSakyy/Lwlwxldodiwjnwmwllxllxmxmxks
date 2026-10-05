package q81;

import com.google.android.gms.internal.measurement.i4;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/work/p/classes5.dex */
public final class s extends y {
    public static final q e;
    public static final q f;
    public static final byte[] g;
    public static final byte[] h;
    public static final byte[] i;
    public final h91.k a;
    public final List b;
    public final q c;
    public long d;

    static {
        t71.n nVar = q.d;
        e = i4.V("multipart/mixed");
        i4.V("multipart/alternative");
        i4.V("multipart/digest");
        i4.V("multipart/parallel");
        f = i4.V("multipart/form-data");
        g = new byte[]{58, 32};
        h = new byte[]{13, 10};
        i = new byte[]{45, 45};
    }

    public s(h91.k kVar, q qVar, List list) {
        k71.k.g(kVar, "boundaryByteString");
        k71.k.g(qVar, "type");
        this.a = kVar;
        this.b = list;
        t71.n nVar = q.d;
        this.c = i4.V(qVar + "; boundary=" + kVar.r());
        this.d = -1L;
    }

    @Override // q81.y
    public final long a() {
        long j = this.d;
        if (j != -1) {
            return j;
        }
        long e2 = e(null, true);
        this.d = e2;
        return e2;
    }

    @Override // q81.y
    public final q b() {
        return this.c;
    }

    @Override // q81.y
    public final boolean c() {
        List list = this.b;
        if (list != null && list.isEmpty()) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((r) it.next()).b.c()) {
                return true;
            }
        }
        return false;
    }

    @Override // q81.y
    public final void d(h91.i iVar) {
        e(iVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long e(h91.i iVar, boolean z) {
        h91.h hVar;
        h91.i iVar2;
        if (z) {
            iVar2 = new h91.h();
            hVar = iVar2;
        } else {
            hVar = 0;
            iVar2 = iVar;
        }
        List list = this.b;
        int size = list.size();
        long j = 0;
        int i2 = 0;
        while (true) {
            h91.k kVar = this.a;
            byte[] bArr = i;
            byte[] bArr2 = h;
            if (i2 >= size) {
                k71.k.d(iVar2);
                iVar2.write(bArr);
                iVar2.p(kVar);
                iVar2.write(bArr);
                iVar2.write(bArr2);
                if (!z) {
                    return j;
                }
                k71.k.d(hVar);
                long j2 = j + hVar.s;
                hVar.r();
                return j2;
            }
            r rVar = (r) list.get(i2);
            n nVar = rVar.a;
            y yVar = rVar.b;
            k71.k.d(iVar2);
            iVar2.write(bArr);
            iVar2.p(kVar);
            iVar2.write(bArr2);
            int size2 = nVar.size();
            for (int i3 = 0; i3 < size2; i3++) {
                iVar2.d0(nVar.b(i3)).write(g).d0(nVar.e(i3)).write(bArr2);
            }
            q b = yVar.b();
            if (b != null) {
                iVar2.d0("Content-Type: ").d0(b.a).write(bArr2);
            }
            long a = yVar.a();
            if (a == -1 && z) {
                k71.k.d(hVar);
                hVar.r();
                return -1L;
            }
            iVar2.write(bArr2);
            if (z) {
                j += a;
            } else {
                yVar.d(iVar2);
            }
            iVar2.write(bArr2);
            i2++;
        }
    }
}
