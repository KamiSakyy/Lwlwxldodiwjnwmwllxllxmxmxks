package u5;

import java.nio.ByteBuffer;

/* loaded from: /home/user/work/p/classes.dex */
public final class t {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f32246d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f32247a;

    /* renamed from: b, reason: collision with root package name */
    public final w51.r f32248b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f32249c = 0;

    public t(w51.r rVar, int i) {
        this.f32248b = rVar;
        this.f32247a = i;
    }

    public final int a(int i) {
        androidx.emoji2.text.flatbuffer.a c10 = c();
        int a10 = c10.a(16);
        if (a10 == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) c10.f469u;
        int i10 = a10 + c10.f466r;
        return byteBuffer.getInt((i * 4) + byteBuffer.getInt(i10) + i10 + 4);
    }

    public final short b() {
        androidx.emoji2.text.flatbuffer.a c10 = c();
        int a10 = c10.a(10);
        if (a10 != 0) {
            return ((ByteBuffer) c10.f469u).getShort(a10 + c10.f466r);
        }
        return (short) 0;
    }

    public final androidx.emoji2.text.flatbuffer.a c() {
        ThreadLocal threadLocal = f32246d;
        androidx.emoji2.text.flatbuffer.a aVar = (androidx.emoji2.text.flatbuffer.a) threadLocal.get();
        if (aVar == null) {
            aVar = new androidx.emoji2.text.flatbuffer.a();
            threadLocal.set(aVar);
        }
        androidx.emoji2.text.flatbuffer.b bVar = (androidx.emoji2.text.flatbuffer.b) this.f32248b.s;
        int a10 = bVar.a(6);
        if (a10 != 0) {
            int i = a10 + bVar.f466r;
            int i10 = (this.f32247a * 4) + ((ByteBuffer) bVar.f469u).getInt(i) + i + 4;
            int i11 = ((ByteBuffer) bVar.f469u).getInt(i10) + i10;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f469u;
            aVar.f469u = byteBuffer;
            if (byteBuffer != null) {
                aVar.f466r = i11;
                int i12 = i11 - byteBuffer.getInt(i11);
                aVar.f467s = i12;
                aVar.f468t = ((ByteBuffer) aVar.f469u).getShort(i12);
                return aVar;
            }
            aVar.f466r = 0;
            aVar.f467s = 0;
            aVar.f468t = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        androidx.emoji2.text.flatbuffer.a c10 = c();
        int a10 = c10.a(4);
        sb2.append(Integer.toHexString(a10 != 0 ? ((ByteBuffer) c10.f469u).getInt(a10 + c10.f466r) : 0));
        sb2.append(", codepoints:");
        androidx.emoji2.text.flatbuffer.a c11 = c();
        int a11 = c11.a(16);
        if (a11 != 0) {
            int i10 = a11 + c11.f466r;
            i = ((ByteBuffer) c11.f469u).getInt(((ByteBuffer) c11.f469u).getInt(i10) + i10);
        } else {
            i = 0;
        }
        for (int i11 = 0; i11 < i; i11++) {
            sb2.append(Integer.toHexString(a(i11)));
            sb2.append(" ");
        }
        return sb2.toString();
    }


}
