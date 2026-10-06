package w5;

import a0.s0;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;

/* loaded from: /home/user/work/p/classes.dex */
public class b extends InputStream implements DataInput {

    /* renamed from: r, reason: collision with root package name */
    public DataInputStream f33324r;

    /* renamed from: s, reason: collision with root package name */
    public int f33325s;

    /* renamed from: t, reason: collision with root package name */
    public ByteOrder f33326t;

    /* renamed from: u, reason: collision with root package name */
    public byte[] f33327u;

    /* renamed from: v, reason: collision with root package name */
    public int f33328v;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public b(byte[] bArr) {
        this(r0, 0);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        this.f33328v = bArr.length;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.f33324r.available();
    }

    public final void f(int i) {
        int i10 = 0;
        while (i10 < i) {
            int i11 = i - i10;
            DataInputStream dataInputStream = this.f33324r;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.f33327u == null) {
                    this.f33327u = new byte[8192];
                }
                skip = dataInputStream.read(this.f33327u, 0, Math.min(8192, i11));
                if (skip == -1) {
                    throw new EOFException(s0.i("Reached EOF while skipping ", i, " bytes."));
                }
            }
            i10 += skip;
        }
        this.f33325s += i10;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.f33325s++;
        return this.f33324r.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.f33325s++;
        return this.f33324r.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.f33325s++;
        int read = this.f33324r.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.f33325s += 2;
        return this.f33324r.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i10) {
        this.f33325s += i10;
        this.f33324r.readFully(bArr, i, i10);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.f33325s += 4;
        DataInputStream dataInputStream = this.f33324r;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f33326t;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        throw new IOException("Invalid byte order: " + this.f33326t);
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j10;
        long j11;
        this.f33325s += 8;
        DataInputStream dataInputStream = this.f33324r;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f33326t;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            j10 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
            j11 = read;
        } else {
            if (byteOrder != ByteOrder.BIG_ENDIAN) {
                throw new IOException("Invalid byte order: " + this.f33326t);
            }
            j10 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
            j11 = read8;
        }
        return j10 + j11;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.f33325s += 2;
        DataInputStream dataInputStream = this.f33324r;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f33326t;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (short) ((read2 << 8) + read);
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (short) ((read << 8) + read2);
        }
        throw new IOException("Invalid byte order: " + this.f33326t);
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.f33325s += 2;
        return this.f33324r.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.f33325s++;
        return this.f33324r.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.f33325s += 2;
        DataInputStream dataInputStream = this.f33324r;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) < 0) {
            throw new EOFException();
        }
        ByteOrder byteOrder = this.f33326t;
        if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
            return (read2 << 8) + read;
        }
        if (byteOrder == ByteOrder.BIG_ENDIAN) {
            return (read << 8) + read2;
        }
        throw new IOException("Invalid byte order: " + this.f33326t);
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(InputStream inputStream) {
        this(inputStream, 0);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i10) {
        int read = this.f33324r.read(bArr, i, i10);
        this.f33325s += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.f33325s += bArr.length;
        this.f33324r.readFully(bArr);
    }

    public b(InputStream inputStream, int i) {
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.f33324r = dataInputStream;
        dataInputStream.mark(0);
        this.f33325s = 0;
        this.f33326t = byteOrder;
        this.f33328v = inputStream instanceof b ? ((b) inputStream).f33328v : -1;
    }
}
