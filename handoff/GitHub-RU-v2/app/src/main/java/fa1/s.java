package fa1;

import androidx.lifecycle.l1;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.net.URI;
import java.util.Map;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class s {
    public p0 a;
    public q81.d b;
    public n c;

    public s(p0 p0Var, q81.d dVar, n nVar) {
        this.a = p0Var;
        this.b = dVar;
        this.c = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x08fa  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x08fe A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static s b(l1 l1Var, Class cls, Method method) {
        Type genericReturnType;
        boolean z;
        boolean z2;
        boolean z3;
        x0Shadow x0Var;
        int i;
        int i2;
        x0Shadow[] x0VarArr;
        int i3;
        int i4;
        String str;
        x0Shadow x0Var2;
        x0Shadow f0Var;
        a0 a0Var;
        a0 a0Var2;
        String str2;
        o0Shadow o0Var = new o0Shadow(l1Var, cls, method);
        Annotation[] annotationArr = o0Var.d;
        int length = annotationArr.length;
        int i5 = 0;
        int i6 = 0;
        loop0: while (true) {
            String str3 = "HEAD";
            boolean z4 = true;
            x0Shadow x0Var3 = null;
            if (i6 >= length) {
                if (o0Var.o == null) {
                    throw x0.m(method, null, "HTTP method annotation is required (e.g., @GET, @POST, etc.).", new Object[0]);
                }
                if (!o0Var.p) {
                    if (o0Var.r) {
                        throw x0.m(method, null, "Multipart can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                    if (o0Var.q) {
                        throw x0.m(method, null, "FormUrlEncoded can only be specified on HTTP methods with request body (e.g., @POST).", new Object[0]);
                    }
                }
                Annotation[][] annotationArr2 = o0Var.e;
                int length2 = annotationArr2.length;
                o0Var.w = new x0Shadow[length2];
                int i7 = length2 - 1;
                int i8 = 0;
                while (i8 < length2) {
                    x0Shadow[] x0VarArr2 = o0Var.w;
                    Type type = o0Var.f[i8];
                    Annotation[] annotationArr3 = annotationArr2[i8];
                    int i9 = i8 == i7 ? 1 : i5;
                    if (annotationArr3 != null) {
                        int length3 = annotationArr3.length;
                        x0Var = x0Var3;
                        int i10 = i5;
                        while (i10 < length3) {
                            Annotation annotation = annotationArr3[i10];
                            Annotation[][] annotationArr4 = annotationArr2;
                            int i11 = length2;
                            if (annotation instanceof ga1.y) {
                                o0Var.c(i8, type);
                                if (o0Var.n) {
                                    throw x0.n(method, i8, "Multiple @Url method annotations found.", new Object[0]);
                                }
                                if (o0Var.j) {
                                    throw x0.n(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                }
                                if (o0Var.k) {
                                    throw x0.n(method, i8, "A @Url parameter must not come after a @Query.", new Object[0]);
                                }
                                if (o0Var.l) {
                                    throw x0.n(method, i8, "A @Url parameter must not come after a @QueryName.", new Object[0]);
                                }
                                if (o0Var.m) {
                                    throw x0.n(method, i8, "A @Url parameter must not come after a @QueryMap.", new Object[0]);
                                }
                                if (o0Var.s != null) {
                                    throw x0.n(method, i8, "@Url cannot be used with @%s URL", o0Var.o);
                                }
                                o0Var.n = true;
                                if (type != q81.o.class && type != String.class && type != URI.class && (!(type instanceof Class) || !"android.net.Uri".equals(((Class) type).getName()))) {
                                    throw x0.n(method, i8, "@Url must be okhttp3.HttpUrl, String, java.net.URI, or android.net.Uri type.", new Object[0]);
                                }
                                x0Var2 = new e0(method, i8, 1);
                                str = str3;
                                i = i7;
                            } else {
                                i = i7;
                                boolean z5 = annotation instanceof ga1.s;
                                l1 l1Var2 = o0Var.a;
                                if (z5) {
                                    o0Var.c(i8, type);
                                    if (o0Var.k) {
                                        throw x0.n(method, i8, "A @Path parameter must not come after a @Query.", new Object[0]);
                                    }
                                    if (o0Var.l) {
                                        throw x0.n(method, i8, "A @Path parameter must not come after a @QueryName.", new Object[0]);
                                    }
                                    if (o0Var.m) {
                                        throw x0.n(method, i8, "A @Path parameter must not come after a @QueryMap.", new Object[0]);
                                    }
                                    if (o0Var.n) {
                                        throw x0.n(method, i8, "@Path parameters may not be used with @Url.", new Object[0]);
                                    }
                                    if (o0Var.s == null) {
                                        throw x0.n(method, i8, "@Path can only be used with relative url on @%s", o0Var.o);
                                    }
                                    o0Var.j = true;
                                    ga1.s sVar = (ga1.s) annotation;
                                    String value = sVar.value();
                                    if (!o0.z.matcher(value).matches()) {
                                        throw x0.n(method, i8, "@Path parameter name must match %s. Found: %s", o0.y.pattern(), value);
                                    }
                                    if (!o0Var.v.contains(value)) {
                                        throw x0.n(method, i8, "URL \"%s\" does not contain \"{%s}\".", o0Var.s, value);
                                    }
                                    l1Var2.F(type, annotationArr3);
                                    x0Var2 = new g0(o0Var.c, i8, value, sVar.encoded());
                                    str = str3;
                                } else {
                                    i2 = i10;
                                    x0VarArr = x0VarArr2;
                                    if (annotation instanceof ga1.t) {
                                        o0Var.c(i8, type);
                                        ga1.t tVar = (ga1.t) annotation;
                                        String value2 = tVar.value();
                                        boolean encoded = tVar.encoded();
                                        i3 = i9;
                                        Class h = x0.h(type);
                                        i4 = length3;
                                        o0Var.k = true;
                                        if (Iterable.class.isAssignableFrom(h)) {
                                            if (!(type instanceof ParameterizedType)) {
                                                throw x0.n(method, i8, h.getSimpleName() + " must include generic type (e.g., " + h.getSimpleName() + "<String>)", new Object[0]);
                                            }
                                            l1Var2.F(x0.g(0, (ParameterizedType) type), annotationArr3);
                                            a0Var2 = new a0(new c0(2, value2, encoded), 0);
                                        } else if (h.isArray()) {
                                            l1Var2.F(o0.a(h.getComponentType()), annotationArr3);
                                            a0Var2 = new a0(new c0(2, value2, encoded), 1);
                                        } else {
                                            l1Var2.F(type, annotationArr3);
                                            x0Var2 = new c0(2, value2, encoded);
                                            str = str3;
                                        }
                                        x0Var2 = a0Var2;
                                        str = str3;
                                    } else {
                                        i3 = i9;
                                        i4 = length3;
                                        if (annotation instanceof ga1.v) {
                                            o0Var.c(i8, type);
                                            boolean encoded2 = ((ga1.v) annotation).encoded();
                                            Class h2 = x0.h(type);
                                            o0Var.l = true;
                                            if (Iterable.class.isAssignableFrom(h2)) {
                                                if (!(type instanceof ParameterizedType)) {
                                                    throw x0.n(method, i8, h2.getSimpleName() + " must include generic type (e.g., " + h2.getSimpleName() + "<String>)", new Object[0]);
                                                }
                                                l1Var2.F(x0.g(0, (ParameterizedType) type), annotationArr3);
                                                a0Var2 = new a0(new h0(encoded2), 0);
                                            } else if (h2.isArray()) {
                                                l1Var2.F(o0.a(h2.getComponentType()), annotationArr3);
                                                a0Var2 = new a0(new h0(encoded2), 1);
                                            } else {
                                                l1Var2.F(type, annotationArr3);
                                                x0Var2 = new h0(encoded2);
                                            }
                                            x0Var2 = a0Var2;
                                        } else if (annotation instanceof ga1.u) {
                                            o0Var.c(i8, type);
                                            Class h3 = x0.h(type);
                                            o0Var.m = true;
                                            if (!Map.class.isAssignableFrom(h3)) {
                                                throw x0.n(method, i8, "@QueryMap parameter type must be Map.", new Object[0]);
                                            }
                                            Type i12 = x0.i(type, h3);
                                            if (!(i12 instanceof ParameterizedType)) {
                                                throw x0.n(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                            }
                                            ParameterizedType parameterizedType = (ParameterizedType) i12;
                                            Type g = x0.g(0, parameterizedType);
                                            if (String.class != g) {
                                                throw x0.n(method, i8, "@QueryMap keys must be of type String: " + g, new Object[0]);
                                            }
                                            l1Var2.F(x0.g(1, parameterizedType), annotationArr3);
                                            x0Var2 = new d0(method, i8, ((ga1.u) annotation).encoded(), 2);
                                        } else {
                                            str = str3;
                                            if (annotation instanceof ga1.i) {
                                                o0Var.c(i8, type);
                                                ga1.i iVar = (ga1.i) annotation;
                                                String value3 = iVar.value();
                                                Class h4 = x0.h(type);
                                                if (Iterable.class.isAssignableFrom(h4)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw x0.n(method, i8, h4.getSimpleName() + " must include generic type (e.g., " + h4.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    l1Var2.F(x0.g(0, (ParameterizedType) type), annotationArr3);
                                                    f0Var = new a0(new c0(1, value3, iVar.allowUnsafeNonAsciiValues()), 0);
                                                } else if (h4.isArray()) {
                                                    l1Var2.F(o0.a(h4.getComponentType()), annotationArr3);
                                                    f0Var = new a0(new c0(1, value3, iVar.allowUnsafeNonAsciiValues()), 1);
                                                } else {
                                                    l1Var2.F(type, annotationArr3);
                                                    x0Var2 = new c0(1, value3, iVar.allowUnsafeNonAsciiValues());
                                                }
                                                x0Var2 = f0Var;
                                            } else if (annotation instanceof ga1.j) {
                                                if (type == q81.n.class) {
                                                    x0Var2 = new e0(method, i8, 0);
                                                } else {
                                                    o0Var.c(i8, type);
                                                    Class h5 = x0.h(type);
                                                    if (!Map.class.isAssignableFrom(h5)) {
                                                        throw x0.n(method, i8, "@HeaderMap parameter type must be Map or Headers.", new Object[0]);
                                                    }
                                                    Type i13 = x0.i(type, h5);
                                                    if (!(i13 instanceof ParameterizedType)) {
                                                        throw x0.n(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                    }
                                                    ParameterizedType parameterizedType2 = (ParameterizedType) i13;
                                                    Type g2 = x0.g(0, parameterizedType2);
                                                    if (String.class != g2) {
                                                        throw x0.n(method, i8, "@HeaderMap keys must be of type String: " + g2, new Object[0]);
                                                    }
                                                    l1Var2.F(x0.g(1, parameterizedType2), annotationArr3);
                                                    x0Var2 = new d0(method, i8, ((ga1.j) annotation).allowUnsafeNonAsciiValues(), 1);
                                                }
                                            } else if (annotation instanceof ga1.c) {
                                                o0Var.c(i8, type);
                                                if (!o0Var.q) {
                                                    throw x0.n(method, i8, "@Field parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                ga1.c cVar = (ga1.c) annotation;
                                                String value4 = cVar.value();
                                                boolean encoded3 = cVar.encoded();
                                                o0Var.g = true;
                                                Class h6 = x0.h(type);
                                                if (Iterable.class.isAssignableFrom(h6)) {
                                                    if (!(type instanceof ParameterizedType)) {
                                                        throw x0.n(method, i8, h6.getSimpleName() + " must include generic type (e.g., " + h6.getSimpleName() + "<String>)", new Object[0]);
                                                    }
                                                    l1Var2.F(x0.g(0, (ParameterizedType) type), annotationArr3);
                                                    f0Var = new a0(new c0(0, value4, encoded3), 0);
                                                } else if (h6.isArray()) {
                                                    l1Var2.F(o0.a(h6.getComponentType()), annotationArr3);
                                                    f0Var = new a0(new c0(0, value4, encoded3), 1);
                                                } else {
                                                    l1Var2.F(type, annotationArr3);
                                                    x0Var2 = new c0(0, value4, encoded3);
                                                }
                                                x0Var2 = f0Var;
                                            } else if (annotation instanceof ga1.d) {
                                                o0Var.c(i8, type);
                                                if (!o0Var.q) {
                                                    throw x0.n(method, i8, "@FieldMap parameters can only be used with form encoding.", new Object[0]);
                                                }
                                                Class h7 = x0.h(type);
                                                if (!Map.class.isAssignableFrom(h7)) {
                                                    throw x0.n(method, i8, "@FieldMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type i14 = x0.i(type, h7);
                                                if (!(i14 instanceof ParameterizedType)) {
                                                    throw x0.n(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType3 = (ParameterizedType) i14;
                                                Type g3 = x0.g(0, parameterizedType3);
                                                if (String.class != g3) {
                                                    throw x0.n(method, i8, "@FieldMap keys must be of type String: " + g3, new Object[0]);
                                                }
                                                l1Var2.F(x0.g(1, parameterizedType3), annotationArr3);
                                                o0Var.g = true;
                                                x0Var2 = new d0(method, i8, ((ga1.d) annotation).encoded(), 0);
                                            } else if (annotation instanceof ga1.q) {
                                                o0Var.c(i8, type);
                                                if (!o0Var.r) {
                                                    throw x0.n(method, i8, "@Part parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                ga1.q qVar = (ga1.q) annotation;
                                                o0Var.h = true;
                                                String value5 = qVar.value();
                                                Class h8 = x0.h(type);
                                                if (value5.isEmpty()) {
                                                    boolean isAssignableFrom = Iterable.class.isAssignableFrom(h8);
                                                    i0 i0Var = i0.d;
                                                    if (isAssignableFrom) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw x0.n(method, i8, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        if (!q81.r.class.isAssignableFrom(x0.h(x0.g(0, (ParameterizedType) type)))) {
                                                            throw x0.n(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        x0Var2 = new a0(i0Var, 0);
                                                    } else if (h8.isArray()) {
                                                        if (!q81.r.class.isAssignableFrom(h8.getComponentType())) {
                                                            throw x0.n(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        x0Var2 = new a0(i0Var, 1);
                                                    } else {
                                                        if (!q81.r.class.isAssignableFrom(h8)) {
                                                            throw x0.n(method, i8, "@Part annotation must supply a name or use MultipartBody.Part parameter type.", new Object[0]);
                                                        }
                                                        x0Var2 = i0Var;
                                                    }
                                                } else {
                                                    String[] strArr = {"Content-Disposition", f1.e.z("form-data; name=\"", value5, "\""), "Content-Transfer-Encoding", qVar.encoding()};
                                                    q81.n nVar = q81.n.s;
                                                    q81.n Z = b4.Z(strArr);
                                                    if (Iterable.class.isAssignableFrom(h8)) {
                                                        if (!(type instanceof ParameterizedType)) {
                                                            throw x0.n(method, i8, h8.getSimpleName() + " must include generic type (e.g., " + h8.getSimpleName() + "<String>)", new Object[0]);
                                                        }
                                                        Type g4 = x0.g(0, (ParameterizedType) type);
                                                        if (q81.r.class.isAssignableFrom(x0.h(g4))) {
                                                            throw x0.n(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        a0Var = new a0(new f0(method, i8, Z, l1Var2.B(g4, annotationArr3, annotationArr)), 0);
                                                    } else if (h8.isArray()) {
                                                        Class a = o0.a(h8.getComponentType());
                                                        if (q81.r.class.isAssignableFrom(a)) {
                                                            throw x0.n(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        a0Var = new a0(new f0(method, i8, Z, l1Var2.B(a, annotationArr3, annotationArr)), 1);
                                                    } else {
                                                        if (q81.r.class.isAssignableFrom(h8)) {
                                                            throw x0.n(method, i8, "@Part parameters using the MultipartBody.Part must not include a part name in the annotation.", new Object[0]);
                                                        }
                                                        f0Var = new f0(method, i8, Z, l1Var2.B(type, annotationArr3, annotationArr));
                                                        x0Var2 = f0Var;
                                                    }
                                                    x0Var2 = a0Var;
                                                }
                                            } else if (annotation instanceof ga1.r) {
                                                o0Var.c(i8, type);
                                                if (!o0Var.r) {
                                                    throw x0.n(method, i8, "@PartMap parameters can only be used with multipart encoding.", new Object[0]);
                                                }
                                                o0Var.h = true;
                                                Class h9 = x0.h(type);
                                                if (!Map.class.isAssignableFrom(h9)) {
                                                    throw x0.n(method, i8, "@PartMap parameter type must be Map.", new Object[0]);
                                                }
                                                Type i15 = x0.i(type, h9);
                                                if (!(i15 instanceof ParameterizedType)) {
                                                    throw x0.n(method, i8, "Map must include generic types (e.g., Map<String, String>)", new Object[0]);
                                                }
                                                ParameterizedType parameterizedType4 = (ParameterizedType) i15;
                                                Type g5 = x0.g(0, parameterizedType4);
                                                if (String.class != g5) {
                                                    throw x0.n(method, i8, "@PartMap keys must be of type String: " + g5, new Object[0]);
                                                }
                                                Type g6 = x0.g(1, parameterizedType4);
                                                if (q81.r.class.isAssignableFrom(x0.h(g6))) {
                                                    throw x0.n(method, i8, "@PartMap values cannot be MultipartBody.Part. Use @Part List<Part> or a different value type instead.", new Object[0]);
                                                }
                                                x0Var2 = new f0(method, i8, l1Var2.B(g6, annotationArr3, annotationArr), ((ga1.r) annotation).encoding());
                                            } else if (annotation instanceof ga1.a) {
                                                o0Var.c(i8, type);
                                                if (o0Var.q || o0Var.r) {
                                                    throw x0.n(method, i8, "@Body parameters cannot be used with form or multi-part encoding.", new Object[0]);
                                                }
                                                if (o0Var.i) {
                                                    throw x0.n(method, i8, "Multiple @Body method annotations found.", new Object[0]);
                                                }
                                                try {
                                                    n B = l1Var2.B(type, annotationArr3, annotationArr);
                                                    o0Var.i = true;
                                                    x0Var2 = new b0(method, i8, B);
                                                } catch (RuntimeException e) {
                                                    throw x0.o(method, e, i8, "Unable to create @Body converter for %s", type);
                                                }
                                            } else if (annotation instanceof ga1.x) {
                                                o0Var.c(i8, type);
                                                Class a2 = o0.a(x0.h(type));
                                                for (int i16 = i8 - 1; i16 >= 0; i16--) {
                                                    x0Shadow x0Var4 = o0Var.w[i16];
                                                    if ((x0Var4 instanceof j0) && ((j0) x0Var4).d.equals(a2)) {
                                                        throw x0.n(method, i8, "@Tag type " + a2.getName() + " is duplicate of " + k0.b.c(method, i16) + " and would always overwrite its value.", new Object[0]);
                                                    }
                                                }
                                                x0Var2 = new j0(a2);
                                            } else {
                                                x0Var2 = null;
                                            }
                                        }
                                        str = str3;
                                    }
                                    if (x0Var2 != null) {
                                        if (x0Var != null) {
                                            throw x0.n(method, i8, "Multiple Retrofit annotations found, only one allowed.", new Object[0]);
                                        }
                                        x0Var = x0Var2;
                                    }
                                    i10 = i2 + 1;
                                    annotationArr2 = annotationArr4;
                                    i7 = i;
                                    length2 = i11;
                                    i9 = i3;
                                    str3 = str;
                                    x0VarArr2 = x0VarArr;
                                    length3 = i4;
                                }
                            }
                            i2 = i10;
                            x0VarArr = x0VarArr2;
                            i3 = i9;
                            i4 = length3;
                            if (x0Var2 != null) {
                            }
                            i10 = i2 + 1;
                            annotationArr2 = annotationArr4;
                            i7 = i;
                            length2 = i11;
                            i9 = i3;
                            str3 = str;
                            x0VarArr2 = x0VarArr;
                            length3 = i4;
                        }
                    } else {
                        x0Var = null;
                    }
                    Annotation[][] annotationArr5 = annotationArr2;
                    int i17 = length2;
                    String str4 = str3;
                    int i18 = i7;
                    x0Shadow[] x0VarArr3 = x0VarArr2;
                    int i19 = i9;
                    if (x0Var == null) {
                        if (i19 != 0) {
                            try {
                                if (x0.h(type) == a71.c.class) {
                                    o0Var.x = true;
                                    x0Var = null;
                                }
                            } catch (NoClassDefFoundError unused) {
                            }
                        }
                        throw x0.n(method, i8, "No Retrofit annotation found.", new Object[0]);
                    }
                    x0VarArr3[i8] = x0Var;
                    i8++;
                    annotationArr2 = annotationArr5;
                    i7 = i18;
                    length2 = i17;
                    str3 = str4;
                    i5 = 0;
                    x0Var3 = null;
                }
                String str5 = str3;
                if (o0Var.s == null && !o0Var.n) {
                    throw x0.m(method, null, "Missing either @%s URL or @Url parameter.", o0Var.o);
                }
                boolean z6 = o0Var.q;
                if (!z6 && !o0Var.r && !o0Var.p && o0Var.i) {
                    throw x0.m(method, null, "Non-body HTTP method cannot contain @Body.", new Object[0]);
                }
                if (z6 && !o0Var.g) {
                    throw x0.m(method, null, "Form-encoded method must contain at least one @Field.", new Object[0]);
                }
                if (o0Var.r && !o0Var.h) {
                    throw x0.m(method, null, "Multipart method must contain at least one @Part.", new Object[0]);
                }
                p0 p0Var = new p0(o0Var);
                Type genericReturnType2 = method.getGenericReturnType();
                if (x0.j(genericReturnType2)) {
                    throw x0.m(method, null, "Method return type must not include a type variable or wildcard: %s", genericReturnType2);
                }
                if (genericReturnType2 == Void.TYPE) {
                    throw x0.m(method, null, "Service methods cannot return void.", new Object[0]);
                }
                Annotation[] annotations = method.getAnnotations();
                boolean z7 = p0Var.l;
                if (z7) {
                    Type[] genericParameterTypes = method.getGenericParameterTypes();
                    Type type2 = ((ParameterizedType) genericParameterTypes[genericParameterTypes.length - 1]).getActualTypeArguments()[0];
                    if (type2 instanceof WildcardType) {
                        type2 = ((WildcardType) type2).getLowerBounds()[0];
                    }
                    if (x0.h(type2) == q0.class && (type2 instanceof ParameterizedType)) {
                        type2 = x0.g(0, (ParameterizedType) type2);
                        z2 = true;
                        z3 = false;
                    } else {
                        if (x0.h(type2) == e.class) {
                            throw x0.m(method, null, "Suspend functions should not return Call, as they already execute asynchronously.\nChange its return type to %s", x0.g(0, (ParameterizedType) type2));
                        }
                        z3 = x0.b && type2 == w61.a0.class;
                        z2 = false;
                    }
                    genericReturnType = new v0(null, e.class, type2);
                    if (!x0.l(annotations, s0.class)) {
                        Annotation[] annotationArr6 = new Annotation[annotations.length + 1];
                        annotationArr6[0] = t0.a;
                        System.arraycopy(annotations, 0, annotationArr6, 1, annotations.length);
                        annotations = annotationArr6;
                    }
                    z = z3;
                } else {
                    genericReturnType = method.getGenericReturnType();
                    z = false;
                    z2 = false;
                }
                try {
                    g k = l1Var.k(genericReturnType, annotations);
                    Type e2 = k.e();
                    if (e2 == q81.a0.class) {
                        throw x0.m(method, null, "'" + x0.h(e2).getName() + "' is not a valid response body type. Did you mean ResponseBody?", new Object[0]);
                    }
                    if (e2 == q0.class) {
                        throw x0.m(method, null, "Response must include generic type (e.g., Response<String>)", new Object[0]);
                    }
                    if (p0Var.d.equals(str5) && !Void.class.equals(e2) && (!x0.b || e2 != w61.a0.class)) {
                        throw x0.m(method, null, "HEAD method must use Void or Unit as response type.", new Object[0]);
                    }
                    try {
                        n C = l1Var.C(e2, method.getAnnotations());
                        q81.d dVar = (q81.d) l1Var.s;
                        return !z7 ? new q(p0Var, dVar, C, k, 0) : z2 ? new q(p0Var, dVar, C, k, 1) : new r(p0Var, dVar, C, k, z);
                    } catch (RuntimeException e3) {
                        throw x0.m(method, e3, "Unable to create converter for %s", e2);
                    }
                } catch (RuntimeException e4) {
                    throw x0.m(method, e4, "Unable to create call adapter for %s", genericReturnType);
                }
            }
            Annotation annotation2 = annotationArr[i6];
            if (annotation2 instanceof ga1.b) {
                o0Var.b("DELETE", ((ga1.b) annotation2).value(), false);
            } else if (annotation2 instanceof ga1.f) {
                o0Var.b("GET", ((ga1.f) annotation2).value(), false);
            } else if (annotation2 instanceof ga1.g) {
                o0Var.b("HEAD", ((ga1.g) annotation2).value(), false);
            } else if (annotation2 instanceof ga1.n) {
                o0Var.b("PATCH", ((ga1.n) annotation2).value(), true);
            } else if (annotation2 instanceof ga1.o) {
                o0Var.b("POST", ((ga1.o) annotation2).value(), true);
            } else if (annotation2 instanceof ga1.p) {
                o0Var.b("PUT", ((ga1.p) annotation2).value(), true);
            } else if (annotation2 instanceof ga1.m) {
                o0Var.b("OPTIONS", ((ga1.m) annotation2).value(), false);
            } else if (annotation2 instanceof ga1.h) {
                ga1.h hVar = (ga1.h) annotation2;
                o0Var.b(hVar.method(), hVar.path(), hVar.hasBody());
            } else if (annotation2 instanceof ga1.k) {
                ga1.k kVar = (ga1.k) annotation2;
                String[] value6 = kVar.value();
                if (value6.length == 0) {
                    throw x0.m(method, null, "@Headers annotation is empty.", new Object[0]);
                }
                boolean allowUnsafeNonAsciiValues = kVar.allowUnsafeNonAsciiValues();
                ia.d dVar2 = new ia.d(4);
                int length4 = value6.length;
                int i20 = 0;
                while (i20 < length4) {
                    str2 = value6[i20];
                    int indexOf = str2.indexOf(58);
                    boolean z8 = z4;
                    if (indexOf == -1 || indexOf == 0 || indexOf == str2.length() - 1) {
                        break loop0;
                    }
                    String substring = str2.substring(0, indexOf);
                    String trim = str2.substring(indexOf + 1).trim();
                    if ("Content-Type".equalsIgnoreCase(substring)) {
                        try {
                            t71.n nVar2 = q81.q.d;
                            o0Var.u = i4.V(trim);
                        } catch (IllegalArgumentException e5) {
                            throw x0.m(method, e5, "Malformed content type: %s", trim);
                        }
                    } else if (allowUnsafeNonAsciiValues) {
                        dVar2.d(substring, trim);
                    } else {
                        dVar2.a(substring, trim);
                    }
                    i20++;
                    z4 = z8;
                }
                o0Var.t = dVar2.e();
            } else if (annotation2 instanceof ga1.l) {
                if (o0Var.q) {
                    throw x0.m(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                o0Var.r = true;
            } else if (!(annotation2 instanceof ga1.e)) {
                continue;
            } else {
                if (o0Var.r) {
                    throw x0.m(method, null, "Only one encoding annotation is allowed.", new Object[0]);
                }
                o0Var.q = true;
            }
            i6++;
        }
        throw x0.m(method, null, "@Headers value must be in the form \"Name: Value\". Found: \"%s\"", str2);
    }

    public abstract Object a(z zVar, Object[] objArr);

}
