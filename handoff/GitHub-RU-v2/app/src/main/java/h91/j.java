package h91;

import java.io.InputStream;
import java.nio.channels.ReadableByteChannel;
import java.nio.charset.Charset;

/* loaded from: /home/user/work/p/classes5.dex */
public interface j extends k0, ReadableByteChannel {
    boolean A0(long j, k kVar);

    void C0(long j);

    InputStream G0();

    byte[] H();

    boolean L();

    String P(long j);

    int Z(y yVar);

    h a();

    String h0(Charset charset);

    String p0();

    long q(k kVar);

    byte readByte();

    void readFully(byte[] bArr);

    int readInt();

    long readLong();

    short readShort();

    boolean request(long j);

    long s(i iVar);

    void skip(long j);

    void u0(h hVar, long j);

    k v(long j);
}
