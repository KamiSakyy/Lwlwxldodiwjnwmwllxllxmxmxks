package h91;

import java.nio.channels.WritableByteChannel;

/* loaded from: /home/user/work/p/classes5.dex */
public interface i extends i0Shadow, WritableByteChannel {
    long G(k0 k0Var);

    h a();

    i a0(int i, byte[] bArr);

    i d0(String str);

    @Override // h91.i0Shadow, java.io.Flushable
    void flush();

    i p(kShadow kVar);

    i write(byte[] bArr);

    i writeByte(int i);

    i writeInt(int i);

    i writeShort(int i);
}
