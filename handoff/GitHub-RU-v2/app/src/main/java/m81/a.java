package m81;

import java.util.ArrayList;
import java.util.NoSuchElementException;
import jo.f4;
import k71.x;
import k81.g0;
import k81.g1;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.json.JsonNull;
import sy.d0;
import t71.w;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a implements l81.i, Decoder, j81.a {
    public final ArrayList a = new ArrayList();
    public boolean b;
    public l81.c c;
    public String d;
    public l81.h e;

    public a(l81.c cVar, String str) {
        this.c = cVar;
        this.d = str;
        this.e = cVar.a;
    }

    @Override // j81.a
    public final Object A(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(kSerializer, "deserializer");
        this.a.add(S(serialDescriptor, i));
        k71.k.g(kSerializer, "deserializer");
        Object u = u(kSerializer);
        if (!this.b) {
            U();
        }
        this.b = false;
        return u;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final byte B() {
        return I(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final short C() {
        return P(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final float D() {
        return L(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final double E() {
        return K(U());
    }

    public abstract kotlinx.serialization.json.b F(String str);

    public final kotlinx.serialization.json.b G() {
        kotlinx.serialization.json.b F;
        String str = (String) x61.m.f0(this.a);
        return (str == null || (F = F(str)) == null) ? T() : F;
    }

    public final boolean H(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (F instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
            try {
                Boolean b = l81.j.b(dVar);
                if (b != null) {
                    return b.booleanValue();
                }
                X(dVar, "boolean", str);
                throw null;
            } catch (IllegalArgumentException unused) {
                X(dVar, "boolean", str);
                throw null;
            }
        }
        throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of boolean at element: " + W(str));
    }

    public final byte I(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (!(F instanceof kotlinx.serialization.json.d)) {
            throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of byte at element: " + W(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
        try {
            long g = l81.j.g(dVar);
            Byte valueOf = (-128 > g || g > 127) ? null : Byte.valueOf((byte) g);
            if (valueOf != null) {
                return valueOf.byteValue();
            }
            X(dVar, "byte", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "byte", str);
            throw null;
        }
    }

    public final char J(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (!(F instanceof kotlinx.serialization.json.d)) {
            throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of char at element: " + W(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
        try {
            String a = dVar.a();
            k71.k.g(a, "<this>");
            int length = a.length();
            if (length == 0) {
                throw new NoSuchElementException("Char sequence is empty.");
            }
            if (length == 1) {
                return a.charAt(0);
            }
            throw new IllegalArgumentException("Char sequence has more than one element.");
        } catch (IllegalArgumentException unused) {
            X(dVar, "char", str);
            throw null;
        }
    }

    public final double K(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (!(F instanceof kotlinx.serialization.json.d)) {
            throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of double at element: " + W(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
        try {
            g0 g0Var = l81.j.a;
            double parseDouble = Double.parseDouble(dVar.a());
            l81.h hVar = this.c.a;
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            throw i.a(Double.valueOf(parseDouble), str, G().toString());
        } catch (IllegalArgumentException unused) {
            X(dVar, "double", str);
            throw null;
        }
    }

    public final float L(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (!(F instanceof kotlinx.serialization.json.d)) {
            throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of float at element: " + W(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
        try {
            g0 g0Var = l81.j.a;
            float parseFloat = Float.parseFloat(dVar.a());
            l81.h hVar = this.c.a;
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            throw i.a(Float.valueOf(parseFloat), str, G().toString());
        } catch (IllegalArgumentException unused) {
            X(dVar, "float", str);
            throw null;
        }
    }

    public final Decoder M(Object obj, SerialDescriptor serialDescriptor) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        k71.k.g(serialDescriptor, "inlineDescriptor");
        if (!s.a(serialDescriptor)) {
            this.a.add(str);
            return this;
        }
        kotlinx.serialization.json.b F = F(str);
        String a = serialDescriptor.a();
        if (F instanceof kotlinx.serialization.json.d) {
            String a2 = ((kotlinx.serialization.json.d) F).a();
            l81.c cVar = this.c;
            k71.k.g(cVar, "json");
            k71.k.g(a2, "source");
            return new g(new a7.q(a2), cVar);
        }
        throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of " + a + " at element: " + W(str));
    }

    public final int N(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (!(F instanceof kotlinx.serialization.json.d)) {
            throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of int at element: " + W(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
        try {
            long g = l81.j.g(dVar);
            Integer valueOf = (-2147483648L > g || g > 2147483647L) ? null : Integer.valueOf((int) g);
            if (valueOf != null) {
                return valueOf.intValue();
            }
            X(dVar, "int", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "int", str);
            throw null;
        }
    }

    public final long O(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (F instanceof kotlinx.serialization.json.d) {
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
            try {
                return l81.j.g(dVar);
            } catch (IllegalArgumentException unused) {
                X(dVar, "long", str);
                throw null;
            }
        }
        throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of long at element: " + W(str));
    }

    public final short P(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (!(F instanceof kotlinx.serialization.json.d)) {
            throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of short at element: " + W(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
        try {
            long g = l81.j.g(dVar);
            Short valueOf = (-32768 > g || g > 32767) ? null : Short.valueOf((short) g);
            if (valueOf != null) {
                return valueOf.shortValue();
            }
            X(dVar, "short", str);
            throw null;
        } catch (IllegalArgumentException unused) {
            X(dVar, "short", str);
            throw null;
        }
    }

    public final String Q(Object obj) {
        String str = (String) obj;
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        if (!(F instanceof kotlinx.serialization.json.d)) {
            throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of string at element: " + W(str));
        }
        kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.d) F;
        if (!(dVar instanceof l81.o)) {
            StringBuilder v = f4.v("Expected string value for a non-null key '", str, "', got null literal instead at element: ");
            v.append(W(str));
            throw i.d(-1, G().toString(), v.toString());
        }
        l81.o oVar = (l81.o) dVar;
        if (oVar.r || this.c.a.c) {
            return oVar.s;
        }
        StringBuilder v2 = f4.v("String literal for key '", str, "' should be quoted at element: ");
        v2.append(W(str));
        v2.append(".\nUse 'isLenient = true' in 'Json {}' builder to accept non-compliant JSON.");
        throw i.d(-1, G().toString(), v2.toString());
    }

    public String R(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return serialDescriptor.g(i);
    }

    public final String S(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "<this>");
        String R = R(serialDescriptor, i);
        k71.k.g(R, "nestedName");
        return R;
    }

    public abstract kotlinx.serialization.json.b T();

    public final Object U() {
        ArrayList arrayList = this.a;
        Object remove = arrayList.remove(d0.m(arrayList));
        this.b = true;
        return remove;
    }

    public final String V() {
        ArrayList arrayList = this.a;
        return arrayList.isEmpty() ? "$" : x61.m.c0(arrayList, ".", "$.", (String) null, 0, (j71.c) null, 60);
    }

    public final String W(String str) {
        k71.k.g(str, "currentTag");
        return V() + '.' + str;
    }

    public final void X(kotlinx.serialization.json.d dVar, String str, String str2) {
        throw i.d(-1, G().toString(), "Failed to parse literal '" + dVar + "' as " + (w.F(str, "i", false) ? "an " : "a ").concat(str) + " value at element: " + W(str2));
    }

    @Override // j81.a
    public final b21.l a() {
        return this.c.b;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public j81.a b(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        kotlinx.serialization.json.b G = G();
        y9.a e = serialDescriptor.e();
        boolean b = k71.k.b(e, i81.k.f);
        l81.c cVar = this.c;
        if (b || (e instanceof i81.d)) {
            String a = serialDescriptor.a();
            if (G instanceof kotlinx.serialization.json.a) {
                return new m(cVar, (kotlinx.serialization.json.a) G);
            }
            throw i.d(-1, G.toString(), "Expected " + x.a(kotlinx.serialization.json.a.class).c() + ", but had " + x.a(G.getClass()).c() + " as the serialized body of " + a + " at element: " + V());
        }
        if (!k71.k.b(e, i81.k.g)) {
            String a2 = serialDescriptor.a();
            if (G instanceof kotlinx.serialization.json.c) {
                return new l(cVar, (kotlinx.serialization.json.c) G, this.d, 8);
            }
            throw i.d(-1, G.toString(), "Expected " + x.a(kotlinx.serialization.json.c.class).c() + ", but had " + x.a(G.getClass()).c() + " as the serialized body of " + a2 + " at element: " + V());
        }
        SerialDescriptor f = i.f(serialDescriptor.j(0), cVar.b);
        y9.a e2 = f.e();
        if (!(e2 instanceof i81.f) && !k71.k.b(e2, i81.j.e)) {
            throw i.c(f);
        }
        String a3 = serialDescriptor.a();
        if (G instanceof kotlinx.serialization.json.c) {
            return new n(cVar, (kotlinx.serialization.json.c) G);
        }
        throw i.d(-1, G.toString(), "Expected " + x.a(kotlinx.serialization.json.c.class).c() + ", but had " + x.a(G.getClass()).c() + " as the serialized body of " + a3 + " at element: " + V());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final boolean c() {
        return H(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final char d() {
        return J(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int e(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "enumDescriptor");
        String str = (String) U();
        k71.k.g(str, "tag");
        kotlinx.serialization.json.b F = F(str);
        String a = serialDescriptor.a();
        if (F instanceof kotlinx.serialization.json.d) {
            return i.j(serialDescriptor, this.c, ((kotlinx.serialization.json.d) F).a(), "");
        }
        throw i.d(-1, F.toString(), "Expected " + x.a(kotlinx.serialization.json.d.class).c() + ", but had " + x.a(F.getClass()).c() + " as the serialized body of " + a + " at element: " + W(str));
    }

    @Override // j81.a
    public final long f(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return O(S(serialDescriptor, i));
    }

    @Override // j81.a
    public void g(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
    }

    @Override // j81.a
    public final float h(g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return L(S(g1Var, i));
    }

    @Override // j81.a
    public final char i(g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return J(S(g1Var, i));
    }

    @Override // j81.a
    public final short j(g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return P(S(g1Var, i));
    }

    @Override // l81.i
    public final kotlinx.serialization.json.b k() {
        return G();
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final int l() {
        return N(U());
    }

    @Override // j81.a
    public final int m(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return N(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final String n() {
        return Q(U());
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final long o() {
        return O(U());
    }

    @Override // j81.a
    public final boolean p(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return H(S(serialDescriptor, i));
    }

    @Override // j81.a
    public final Decoder q(g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return M(S(g1Var, i), g1Var.j(i));
    }

    @Override // j81.a
    public final String r(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return Q(S(serialDescriptor, i));
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public boolean s() {
        return !(G() instanceof JsonNull);
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Object u(KSerializer kSerializer) {
        k71.k.g(kSerializer, "deserializer");
        if (!(kSerializer instanceof k81.b)) {
            return kSerializer.deserialize(this);
        }
        l81.c cVar = this.c;
        l81.h hVar = cVar.a;
        k81.b bVar = (k81.b) kSerializer;
        String h = i.h(bVar.getDescriptor(), cVar);
        kotlinx.serialization.json.b G = G();
        String a = bVar.getDescriptor().a();
        if (!(G instanceof kotlinx.serialization.json.c)) {
            throw i.d(-1, G.toString(), "Expected " + x.a(kotlinx.serialization.json.c.class).c() + ", but had " + x.a(G.getClass()).c() + " as the serialized body of " + a + " at element: " + V());
        }
        kotlinx.serialization.json.c cVar2 = (kotlinx.serialization.json.c) G;
        kotlinx.serialization.json.b bVar2 = (kotlinx.serialization.json.b) cVar2.get(h);
        String str = null;
        if (bVar2 != null) {
            kotlinx.serialization.json.d f = l81.j.f(bVar2);
            if (!(f instanceof JsonNull)) {
                str = f.a();
            }
        }
        try {
            return i.o(cVar, h, cVar2, b41.b.r((k81.b) kSerializer, this, str));
        } catch (SerializationException e) {
            String message = e.getMessage();
            k71.k.d(message);
            throw i.d(-1, cVar2.toString(), message);
        }
    }

    @Override // j81.a
    public final byte v(g1 g1Var, int i) {
        k71.k.g(g1Var, "descriptor");
        return I(S(g1Var, i));
    }

    @Override // l81.i
    public final l81.c w() {
        return this.c;
    }

    @Override // j81.a
    public final Object x(SerialDescriptor serialDescriptor, int i, KSerializer kSerializer, Object obj) {
        k71.k.g(serialDescriptor, "descriptor");
        k71.k.g(kSerializer, "deserializer");
        this.a.add(S(serialDescriptor, i));
        Object u = (kSerializer.getDescriptor().c() || s()) ? u(kSerializer) : null;
        if (!this.b) {
            U();
        }
        this.b = false;
        return u;
    }

    @Override // kotlinx.serialization.encoding.Decoder
    public final Decoder y(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        if (x61.m.f0(this.a) != null) {
            return M(U(), serialDescriptor);
        }
        return new k(this.c, T(), this.d).y(serialDescriptor);
    }

    @Override // j81.a
    public final double z(SerialDescriptor serialDescriptor, int i) {
        k71.k.g(serialDescriptor, "descriptor");
        return K(S(serialDescriptor, i));
    }
    public Object ordinal() { return null; }
}
