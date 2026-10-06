package g91;

import a0.s0;
import h91.t;
import java.io.Closeable;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.zip.Inflater;
import k71.k;

/* loaded from: /home/user/work/p/classes5.dex */
public final class i implements Closeable {
    public boolean A;
    public h91.h B;
    public h91.h C;
    public a D;
    public byte[] E;
    public h91.j r;
    public h s;
    public boolean t;
    public boolean u;
    public boolean v;
    public int w;
    public long x;
    public boolean y;
    public boolean z;

    public i(h91.j jVar, h hVar, boolean z, boolean z2) {
        k.g(jVar, "source");
        this.r = jVar;
        this.s = hVar;
        this.t = z;
        this.u = z2;
        this.B = new h91.h();
        this.C = new h91.h();
        this.E = null;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a aVar = this.D;
        if (aVar != null) {
            r81.e.b(aVar);
        }
        r81.e.b(this.r);
    }

    public final void f() {
        r();
        if (this.z) {
            m();
            return;
        }
        int i = this.w;
        if (i != 1 && i != 2) {
            TimeZone timeZone = r81.g.a;
            String hexString = Integer.toHexString(i);
            k.f(hexString, "toHexString(...)");
            throw new ProtocolException("Unknown opcode: ".concat(hexString));
        }
        while (!this.v) {
            long j = this.x;
            h91.h hVar = this.C;
            if (j > 0) {
                this.r.u0(hVar, j);
            }
            if (this.y) {
                if (this.A) {
                    a aVar = this.D;
                    if (aVar == null) {
                        aVar = new a(this.u, 1);
                        this.D = aVar;
                    }
                    h91.h hVar2 = aVar.t;
                    if (hVar2.s != 0) {
                        throw new IllegalArgumentException("Failed requirement.");
                    }
                    Inflater inflater = (Inflater) aVar.u;
                    if (inflater == null) {
                        inflater = new Inflater(true);
                        aVar.u = inflater;
                    }
                    t tVar = (t) aVar.v;
                    if (tVar == null) {
                        tVar = new t(h91.b.c(hVar2), inflater);
                        aVar.v = tVar;
                    }
                    if (aVar.s) {
                        inflater.reset();
                    }
                    hVar2.G(hVar);
                    hVar2.M0(65535);
                    long bytesRead = inflater.getBytesRead() + hVar2.s;
                    do {
                        tVar.f(hVar, Long.MAX_VALUE);
                        if (inflater.getBytesRead() >= bytesRead) {
                            break;
                        }
                    } while (!inflater.finished());
                    if (inflater.getBytesRead() < bytesRead) {
                        hVar2.r();
                        tVar.close();
                        aVar.v = null;
                        aVar.u = null;
                    }
                }
                h hVar3 = this.s;
                if (i == 1) {
                    f fVar = (f) hVar3;
                    fVar.a.K(fVar, hVar.o0());
                    return;
                } else {
                    h91.kShadow v = hVar.v(hVar.s);
                    f fVar2 = (f) hVar3;
                    k.g(v, "bytes");
                    fVar2.a.J(fVar2, v);
                    return;
                }
            }
            while (!this.v) {
                r();
                if (!this.z) {
                    break;
                } else {
                    m();
                }
            }
            if (this.w != 0) {
                int i2 = this.w;
                TimeZone timeZone2 = r81.g.a;
                String hexString2 = Integer.toHexString(i2);
                k.f(hexString2, "toHexString(...)");
                throw new ProtocolException("Expected continuation opcode. Got: ".concat(hexString2));
            }
        }
        throw new IOException("closed");
    }

    public final void m() {
        String str;
        short s;
        long j = this.x;
        if (j > 0) {
            this.r.u0(this.B, j);
        }
        switch (this.w) {
            case 8:
                h91.h hVar = this.B;
                long j2 = hVar.s;
                if (j2 == 1) {
                    throw new ProtocolException("Malformed close payload length of 1.");
                }
                if (j2 != 0) {
                    s = hVar.readShort();
                    str = this.B.o0();
                    String k = (s < 1000 || s >= 5000) ? no.a.k("Code must be in range [1000,5000): ", s) : ((1004 > s || s >= 1007) && (1015 > s || s >= 3000)) ? null : s0.i("Code ", s, " is reserved and may not be used.");
                    if (k != null) {
                        throw new ProtocolException(k);
                    }
                } else {
                    str = "";
                    s = 1005;
                }
                f fVar = (f) this.s;
                if (s == -1) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                synchronized (fVar) {
                    if (fVar.s != -1) {
                        throw new IllegalStateException("already closed");
                    }
                    fVar.s = s;
                    fVar.t = str;
                }
                fVar.a.H(fVar, s, str);
                this.v = true;
                return;
            case 9:
                h hVar2 = this.s;
                h91.h hVar3 = this.B;
                h91.kShadow v = hVar3.v(hVar3.s);
                f fVar2 = (f) hVar2;
                synchronized (fVar2) {
                    try {
                        k.g(v, "payload");
                        if (!fVar2.u && (!fVar2.r || !fVar2.p.isEmpty())) {
                            fVar2.o.add(v);
                            fVar2.e();
                            return;
                        }
                        return;
                    } finally {
                    }
                }
            case 10:
                h hVar4 = this.s;
                h91.h hVar5 = this.B;
                h91.kShadow v2 = hVar5.v(hVar5.s);
                f fVar3 = (f) hVar4;
                synchronized (fVar3) {
                    k.g(v2, "payload");
                    fVar3.w = false;
                }
                return;
            default:
                int i = this.w;
                TimeZone timeZone = r81.g.a;
                String hexString = Integer.toHexString(i);
                k.f(hexString, "toHexString(...)");
                throw new ProtocolException("Unknown control opcode: ".concat(hexString));
        }
    }

    public final void r() {
        boolean z;
        if (this.v) {
            throw new IOException("closed");
        }
        h91.j jVar = this.r;
        long h = jVar.b().h();
        jVar.b().b();
        try {
            byte readByte = jVar.readByte();
            byte[] bArr = r81.e.a;
            jVar.b().g(h, TimeUnit.NANOSECONDS);
            int i = readByte & 15;
            this.w = i;
            boolean z2 = (readByte & 128) != 0;
            this.y = z2;
            boolean z3 = (readByte & 8) != 0;
            this.z = z3;
            if (z3 && !z2) {
                throw new ProtocolException("Control frames must be final.");
            }
            boolean z4 = (readByte & 64) != 0;
            if (i == 1 || i == 2) {
                if (!z4) {
                    z = false;
                } else {
                    if (!this.t) {
                        throw new ProtocolException("Unexpected rsv1 flag");
                    }
                    z = true;
                }
                this.A = z;
            } else if (z4) {
                throw new ProtocolException("Unexpected rsv1 flag");
            }
            if ((readByte & 32) != 0) {
                throw new ProtocolException("Unexpected rsv2 flag");
            }
            if ((readByte & 16) != 0) {
                throw new ProtocolException("Unexpected rsv3 flag");
            }
            byte readByte2 = jVar.readByte();
            boolean z5 = (readByte2 & 128) != 0;
            if (z5) {
                throw new ProtocolException("Server-sent frames must not be masked.");
            }
            long j = readByte2 & Byte.MAX_VALUE;
            this.x = j;
            if (j == 126) {
                this.x = jVar.readShort() & 65535;
            } else if (j == 127) {
                long readLong = jVar.readLong();
                this.x = readLong;
                if (readLong < 0) {
                    StringBuilder sb = new StringBuilder("Frame length 0x");
                    long j2 = this.x;
                    TimeZone timeZone = r81.g.a;
                    String hexString = Long.toHexString(j2);
                    k.f(hexString, "toHexString(...)");
                    sb.append(hexString);
                    sb.append(" > 0x7FFFFFFFFFFFFFFF");
                    throw new ProtocolException(sb.toString());
                }
            }
            if (this.z && this.x > 125) {
                throw new ProtocolException("Control frame must be less than 125B.");
            }
            if (z5) {
                byte[] bArr2 = this.E;
                k.d(bArr2);
                jVar.readFully(bArr2);
            }
        } catch (Throwable th) {
            jVar.b().g(h, TimeUnit.NANOSECONDS);
            throw th;
        }
    }
}
