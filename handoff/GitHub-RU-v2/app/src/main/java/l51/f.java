package l51;

import com.google.firebase.encoders.EncodingException;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jo.f4;

/* loaded from: /home/user/work/p/classes4.dex */
public final class f implements i51.d {
    public static final Charset f = Charset.forName("UTF-8");
    public static final i51.b g = new i51.b("key", f4.x(f4.w(e.class, new a(1))));
    public static final i51.b h = new i51.b("value", f4.x(f4.w(e.class, new a(2))));
    public static final k51.a i = new k51.a(1);
    public OutputStream a;
    public HashMap b;
    public HashMap c;
    public i51.c d;
    public final i e = new i(this);

    public f(ByteArrayOutputStream byteArrayOutputStream, HashMap hashMap, HashMap hashMap2, i51.c cVar) {
        this.a = byteArrayOutputStream;
        this.b = hashMap;
        this.c = hashMap2;
        this.d = cVar;
    }

    public static int j(i51.b bVar) {
        e eVar = (e) ((Annotation) bVar.b.get(e.class));
        if (eVar != null) {
            return ((a) eVar).a;
        }
        throw new EncodingException("Field has no @Protobuf config");
    }

    @Override // i51.d
    public final i51.d a(i51.b bVar, Object obj) {
        h(bVar, obj, true);
        return this;
    }

    public final void b(i51.b bVar, double d, boolean z) {
        if (z && d == 0.0d) {
            return;
        }
        k((j(bVar) << 3) | 1);
        this.a.write(ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN).putDouble(d).array());
    }

    public final void c(i51.b bVar, int i2, boolean z) {
        if (z && i2 == 0) {
            return;
        }
        e eVar = (e) ((Annotation) bVar.b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k(((a) eVar).a << 3);
        k(i2);
    }

    @Override // i51.d
    public final i51.d d(i51.b bVar, long j) {
        if (j == 0) {
            return this;
        }
        e eVar = (e) ((Annotation) bVar.b.get(e.class));
        if (eVar == null) {
            throw new EncodingException("Field has no @Protobuf config");
        }
        k(((a) eVar).a << 3);
        l(j);
        return this;
    }

    @Override // i51.d
    public final i51.d e(i51.b bVar, int i2) {
        c(bVar, i2, true);
        return this;
    }

    @Override // i51.d
    public final i51.d f(i51.b bVar, double d) {
        b(bVar, d, true);
        return this;
    }

    @Override // i51.d
    public final i51.d g(i51.b bVar, boolean z) {
        c(bVar, z ? 1 : 0, true);
        return this;
    }

    public final void h(i51.b bVar, Object obj, boolean z) {
        if (obj == null) {
            return;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return;
            }
            k((j(bVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f);
            k(bytes.length);
            this.a.write(bytes);
            return;
        }
        if (obj instanceof Collection) {
            Iterator it = ((Collection) obj).iterator();
            while (it.hasNext()) {
                h(bVar, it.next(), false);
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                i(i, bVar, (Map.Entry) it2.next(), false);
            }
            return;
        }
        if (obj instanceof Double) {
            b(bVar, ((Double) obj).doubleValue(), z);
            return;
        }
        if (obj instanceof Float) {
            float floatValue = ((Float) obj).floatValue();
            if (z && floatValue == 0.0f) {
                return;
            }
            k((j(bVar) << 3) | 5);
            this.a.write(ByteBuffer.allocate(4).order(ByteOrder.LITTLE_ENDIAN).putFloat(floatValue).array());
            return;
        }
        if (obj instanceof Number) {
            long longValue = ((Number) obj).longValue();
            if (z && longValue == 0) {
                return;
            }
            e eVar = (e) ((Annotation) bVar.b.get(e.class));
            if (eVar == null) {
                throw new EncodingException("Field has no @Protobuf config");
            }
            k(((a) eVar).a << 3);
            l(longValue);
            return;
        }
        if (obj instanceof Boolean) {
            c(bVar, ((Boolean) obj).booleanValue() ? 1 : 0, z);
            return;
        }
        if (obj instanceof byte[]) {
            byte[] bArr = (byte[]) obj;
            if (z && bArr.length == 0) {
                return;
            }
            k((j(bVar) << 3) | 2);
            k(bArr.length);
            this.a.write(bArr);
            return;
        }
        i51.c cVar = (i51.c) this.b.get(obj.getClass());
        if (cVar != null) {
            i(cVar, bVar, obj, z);
            return;
        }
        i51.e eVar2 = (i51.e) this.c.get(obj.getClass());
        if (eVar2 != null) {
            i iVar = this.e;
            iVar.a = false;
            iVar.c = bVar;
            iVar.b = z;
            eVar2.a(obj, iVar);
            return;
        }
        if (obj instanceof c) {
            c(bVar, ((c) obj).b(), true);
        } else if (obj instanceof Enum) {
            c(bVar, ((Enum) obj).ordinal(), true);
        } else {
            i(this.d, bVar, obj, z);
        }
    }

    public final void i(i51.c cVar, i51.b bVar, Object obj, boolean z) {
        b bVar2 = new b();
        bVar2.r = 0L;
        try {
            OutputStream outputStream = this.a;
            this.a = bVar2;
            try {
                cVar.a(obj, this);
                this.a = outputStream;
                long j = bVar2.r;
                bVar2.close();
                if (z && j == 0) {
                    return;
                }
                k((j(bVar) << 3) | 2);
                l(j);
                cVar.a(obj, this);
            } catch (Throwable th) {
                this.a = outputStream;
                throw th;
            }
        } catch (Throwable th2) {
            try {
                bVar2.close();
            } catch (Throwable th3) {
                th2.addSuppressed(th3);
            }
            throw th2;
        }
    }

    public final void k(int i2) {
        while ((i2 & (-128)) != 0) {
            this.a.write((i2 & 127) | 128);
            i2 >>>= 7;
        }
        this.a.write(i2 & 127);
    }

    public final void l(long j) {
        while (((-128) & j) != 0) {
            this.a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.a.write(((int) j) & 127);
    }
    public static final Object a = null;
}
