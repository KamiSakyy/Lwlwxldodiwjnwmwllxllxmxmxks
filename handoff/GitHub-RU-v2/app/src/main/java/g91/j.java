package g91;

import com.google.android.gms.internal.measurement.i4;
import h91.f0;
import h91.l;
import java.io.Closeable;
import java.io.IOException;
import java.util.Random;
import java.util.zip.Deflater;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class j implements Closeable {
    public byte[] A;
    public h91.f B;
    public h91.i r;
    public Random s;
    public boolean t;
    public boolean u;
    public long v;
    public h91.h w;
    public h91.h x;
    public boolean y;
    public a z;

    public j(h91.i iVar, Random random, boolean z, boolean z2, long j) {
        k.g(iVar, "sink");
        this.r = iVar;
        this.s = random;
        this.t = z;
        this.u = z2;
        this.v = j;
        this.w = new h91.h();
        this.x = iVar.a();
        this.A = new byte[4];
        this.B = new h91.f();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.z;
        if (aVar != null) {
            r81.e.b(aVar);
        }
        r81.e.b(this.r);
    }

    public final void f(int i, h91.k kVar) {
        if (this.y) {
            throw new IOException("closed");
        }
        int d = kVar.d();
        if (d > 125) {
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        h91.h hVar = this.x;
        hVar.J0(i | 128);
        hVar.J0(d | 128);
        byte[] bArr = this.A;
        k.d(bArr);
        this.s.nextBytes(bArr);
        hVar.write(bArr, 0, bArr.length);
        if (d > 0) {
            long j = hVar.s;
            hVar.E0(kVar);
            h91.f fVar = this.B;
            k.d(fVar);
            hVar.O(fVar);
            fVar.m(j);
            i4.A0(fVar, bArr);
            fVar.close();
        }
        this.r.flush();
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x013a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i, h91.k kVar) {
        long j;
        if (this.y) {
            throw new IOException("closed");
        }
        h91.h hVar = this.w;
        hVar.E0(kVar);
        int i2 = i | 128;
        if (this.t && kVar.d() >= this.v) {
            a aVar = this.z;
            if (aVar == null) {
                aVar = new a(this.u, 0);
                this.z = aVar;
            }
            l lVar = (l) aVar.v;
            h91.h hVar2 = aVar.t;
            if (hVar2.s != 0) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            if (aVar.s) {
                ((Deflater) aVar.u).reset();
            }
            lVar.I0(hVar, hVar.s);
            lVar.flush();
            if (hVar2.A0(hVar2.s - r3.r.length, b.a)) {
                long j2 = hVar2.s - 4;
                h91.f O = hVar2.O(h91.b.a);
                try {
                    O.f(j2);
                    O.close();
                } finally {
                }
            } else {
                hVar2.J0(0);
            }
            hVar.I0(hVar2, hVar2.s);
            i2 = i | 192;
        }
        long j3 = hVar.s;
        h91.h hVar3 = this.x;
        hVar3.J0(i2);
        if (j3 <= 125) {
            hVar3.J0(((int) j3) | 128);
        } else {
            if (j3 > 65535) {
                hVar3.J0(255);
                f0 x0 = hVar3.x0(8);
                byte[] bArr = x0.a;
                int i3 = x0.c;
                bArr[i3] = (byte) ((j3 >>> 56) & 255);
                j = 0;
                bArr[i3 + 1] = (byte) ((j3 >>> 48) & 255);
                bArr[i3 + 2] = (byte) ((j3 >>> 40) & 255);
                bArr[i3 + 3] = (byte) ((j3 >>> 32) & 255);
                bArr[i3 + 4] = (byte) ((j3 >>> 24) & 255);
                bArr[i3 + 5] = (byte) ((j3 >>> 16) & 255);
                bArr[i3 + 6] = (byte) ((j3 >>> 8) & 255);
                bArr[i3 + 7] = (byte) (j3 & 255);
                x0.c = i3 + 8;
                hVar3.s += 8;
                byte[] bArr2 = this.A;
                k.d(bArr2);
                this.s.nextBytes(bArr2);
                hVar3.write(bArr2, 0, bArr2.length);
                if (j3 > j) {
                    h91.f fVar = this.B;
                    k.d(fVar);
                    hVar.O(fVar);
                    fVar.m(j);
                    i4.A0(fVar, bArr2);
                    fVar.close();
                }
                hVar3.I0(hVar, j3);
                this.r.flush();
            }
            hVar3.J0(254);
            hVar3.N0((int) j3);
        }
        j = 0;
        byte[] bArr22 = this.A;
        k.d(bArr22);
        this.s.nextBytes(bArr22);
        hVar3.write(bArr22, 0, bArr22.length);
        if (j3 > j) {
        }
        hVar3.I0(hVar, j3);
        this.r.flush();
    }
    public Object b(Object p1, Object p2) { return null; }
    public Object d(Object p1) { return null; }
    public Object g(Object p1, Object p2) { return null; }
}
