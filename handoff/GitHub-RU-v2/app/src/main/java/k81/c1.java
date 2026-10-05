package k81;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.MissingFieldException;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class c1 {
    public static final SerialDescriptor[] a = new SerialDescriptor[0];
    public static final KSerializer[] b = new KSerializer[0];
    public static final Object c = new Object();

    public static final g0 a(String str, KSerializer kSerializer) {
        return new g0(str, new h0(kSerializer));
    }

    public static final Set b(SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "<this>");
        if (serialDescriptor instanceof l) {
            return ((l) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.f());
        int f = serialDescriptor.f();
        for (int i = 0; i < f; i++) {
            hashSet.add(serialDescriptor.g(i));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] c(List list) {
        SerialDescriptor[] serialDescriptorArr;
        if (list == null || list.isEmpty()) {
            list = null;
        }
        return (list == null || (serialDescriptorArr = (SerialDescriptor[]) list.toArray(new SerialDescriptor[0])) == null) ? a : serialDescriptorArr;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:63)(1:62))(2:112|113))|(5:107|108|109|(8:81|82|(1:(3:84|(1:102)(1:(1:90)(2:87|88))|89)(2:103|(1:105)))|91|(1:101)(1:95)|96|(1:98)|100)|(1:70)(2:71|(1:77)(2:79|80)))|65|(1:67)|81|82|(2:(0)(0)|89)|91|(1:93)|101|96|(0)|100|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x0104, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x00ba, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0116 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x016b A[Catch: NoSuchFieldException -> 0x019b, TryCatch #1 {NoSuchFieldException -> 0x019b, blocks: (B:82:0x015d, B:84:0x016b, B:93:0x0188, B:95:0x018e, B:96:0x0194, B:98:0x0198, B:89:0x0180), top: B:81:0x015d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0198 A[Catch: NoSuchFieldException -> 0x019b, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x019b, blocks: (B:82:0x015d, B:84:0x016b, B:93:0x0188, B:95:0x018e, B:96:0x0194, B:98:0x0198, B:89:0x0180), top: B:81:0x015d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer d(Class cls, KSerializer... kSerializerArr) {
        Object obj;
        KSerializer kSerializer;
        Class<?> cls2;
        Object obj2;
        KSerializer kSerializer2;
        int length;
        int i;
        Object obj3;
        Field field;
        g81.e eVar;
        k71.k.g(cls, "<this>");
        k71.k.g(kSerializerArr, "args");
        if (cls.isEnum() && cls.getAnnotation(g81.e.class) == null && cls.getAnnotation(g81.a.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            k71.k.f(canonicalName, "getCanonicalName(...)");
            k71.k.e(enumConstants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
            return new z(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer h = obj == null ? null : h(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
        if (h != null) {
            return h;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 != null && !t71.w.F(canonicalName2, "java.", false) && !t71.w.F(canonicalName2, "kotlin.", false)) {
            Field[] declaredFields = cls.getDeclaredFields();
            k71.k.f(declaredFields, "getDeclaredFields(...)");
            int length2 = declaredFields.length;
            Field field2 = null;
            int i2 = 0;
            boolean z = false;
            while (true) {
                if (i2 < length2) {
                    Field field3 = declaredFields[i2];
                    if (k71.k.b(field3.getName(), "INSTANCE") && k71.k.b(field3.getType(), cls) && Modifier.isStatic(field3.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field2 = field3;
                    }
                    i2++;
                }
            }
            field2 = null;
            if (field2 != null) {
                Object obj4 = field2.get(null);
                Method[] methods = cls.getMethods();
                k71.k.f(methods, "getMethods(...)");
                int length3 = methods.length;
                Method method = null;
                int i3 = 0;
                boolean z2 = false;
                while (true) {
                    if (i3 < length3) {
                        Method method2 = methods[i3];
                        if (k71.k.b(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            k71.k.f(parameterTypes, "getParameterTypes(...)");
                            if (parameterTypes.length == 0 && k71.k.b(method2.getReturnType(), KSerializer.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i3++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof KSerializer) {
                        kSerializer = (KSerializer) invoke;
                        if (kSerializer == null) {
                            return kSerializer;
                        }
                        KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
                        Class<?>[] declaredClasses = cls.getDeclaredClasses();
                        k71.k.f(declaredClasses, "getDeclaredClasses(...)");
                        int length4 = declaredClasses.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length4) {
                                cls2 = null;
                                break;
                            }
                            cls2 = declaredClasses[i4];
                            if (cls2.getAnnotation(w0.class) != null) {
                                break;
                            }
                            i4++;
                        }
                        if (cls2 != null) {
                            try {
                                Field declaredField2 = cls.getDeclaredField(cls2.getSimpleName());
                                declaredField2.setAccessible(true);
                                obj2 = declaredField2.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (kSerializer2 = h(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr3, kSerializerArr3.length))) == null) {
                                Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                                k71.k.f(declaredClasses2, "getDeclaredClasses(...)");
                                length = declaredClasses2.length;
                                Class<?> cls3 = null;
                                i = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i >= length) {
                                        Class<?> cls4 = declaredClasses2[i];
                                        if (cls4.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls3 = cls4;
                                        }
                                        i++;
                                    } else if (!z3) {
                                    }
                                }
                                cls3 = null;
                                obj3 = (cls3 != null || (field = cls3.getField("INSTANCE")) == null) ? null : field.get(null);
                                if (obj3 instanceof KSerializer) {
                                    kSerializer2 = (KSerializer) obj3;
                                }
                                kSerializer2 = null;
                            }
                            if (kSerializer2 == null) {
                                return kSerializer2;
                            }
                            if (cls.getAnnotation(g81.a.class) == null && ((eVar = (g81.e) cls.getAnnotation(g81.e.class)) == null || !k71.x.a(eVar.with()).equals(k71.x.a(g81.b.class)))) {
                                return null;
                            }
                            return new g81.b(k71.x.a(cls));
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses22 = cls.getDeclaredClasses();
                        k71.k.f(declaredClasses22, "getDeclaredClasses(...)");
                        length = declaredClasses22.length;
                        Class<?> cls32 = null;
                        i = 0;
                        boolean z32 = false;
                        while (true) {
                            if (i >= length) {
                            }
                            i++;
                        }
                        cls32 = null;
                        if (cls32 != null) {
                        }
                        if (obj3 instanceof KSerializer) {
                        }
                        kSerializer2 = null;
                        if (kSerializer2 == null) {
                        }
                    }
                }
            }
        }
        kSerializer = null;
        if (kSerializer == null) {
        }
    }

    public static final z e(String str, Enum[] enumArr, String[] strArr, Annotation[][] annotationArr) {
        k71.k.g(enumArr, "values");
        y yVar = new y(str, enumArr.length);
        int length = enumArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            Enum r5 = enumArr[i];
            int i3 = i2 + 1;
            String str2 = (String) x61.l.P(i2, strArr);
            if (str2 == null) {
                str2 = r5.name();
            }
            yVar.l(str2, false);
            Annotation[] annotationArr2 = (Annotation[]) x61.l.P(i2, annotationArr);
            if (annotationArr2 != null) {
                for (Annotation annotation : annotationArr2) {
                    k71.k.g(annotation, "annotation");
                    int i4 = yVar.d;
                    List[] listArr = yVar.f;
                    List list = listArr[i4];
                    if (list == null) {
                        list = new ArrayList(1);
                        listArr[yVar.d] = list;
                    }
                    list.add(annotation);
                }
            }
            i++;
            i2 = i3;
        }
        z zVar = new z(str, enumArr);
        zVar.c = yVar;
        return zVar;
    }

    public static final z f(String str, Enum[] enumArr) {
        k71.k.g(enumArr, "values");
        return new z(str, enumArr);
    }

    public static final int g(SerialDescriptor serialDescriptor, SerialDescriptor[] serialDescriptorArr) {
        k71.k.g(serialDescriptorArr, "typeParams");
        int hashCode = (serialDescriptor.a().hashCode() * 31) + Arrays.hashCode(serialDescriptorArr);
        int f = serialDescriptor.f();
        int i = 1;
        while (true) {
            int i2 = 0;
            if (!(f > 0)) {
                break;
            }
            int i3 = f - 1;
            int i4 = i * 31;
            String a2 = serialDescriptor.j(serialDescriptor.f() - f).a();
            if (a2 != null) {
                i2 = a2.hashCode();
            }
            i = i4 + i2;
            f = i3;
        }
        int f2 = serialDescriptor.f();
        int i5 = 1;
        while (true) {
            if (!(f2 > 0)) {
                return (((hashCode * 31) + i) * 31) + i5;
            }
            int i6 = f2 - 1;
            int i7 = i5 * 31;
            y9.a e = serialDescriptor.j(serialDescriptor.f() - f2).e();
            i5 = i7 + (e != null ? e.hashCode() : 0);
            f2 = i6;
        }
    }

    public static final KSerializer h(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause == null) {
                throw e;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static final boolean i(r71.b bVar) {
        k71.k.g(bVar, "<this>");
        return v8.l0.x(bVar).isInterface();
    }

    public static final r71.b j(r71.f fVar) {
        r71.b c2 = fVar.c();
        if (c2 instanceof r71.b) {
            return c2;
        }
        throw new IllegalArgumentException("Only KClass supported as classifier, got " + c2);
    }

    public static final String k(r71.b bVar) {
        k71.k.g(bVar, "<this>");
        String c2 = ((k71.e) bVar).c();
        if (c2 == null) {
            c2 = "<local class name not available>";
        }
        return f1.e.z("Serializer for class '", c2, "' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
    }

    public static final void l(int i, int i2, SerialDescriptor serialDescriptor) {
        k71.k.g(serialDescriptor, "descriptor");
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(serialDescriptor.g(i4));
            }
            i3 >>>= 1;
        }
        String a2 = serialDescriptor.a();
        k71.k.g(a2, "serialName");
        throw new MissingFieldException(arrayList, arrayList.size() == 1 ? x.i.k(new StringBuilder("Field '"), (String) arrayList.get(0), "' is required for type with serial name '", a2, "', but it was missing") : "Fields " + arrayList + " are required for type with serial name '" + a2 + "', but they were missing", null);
    }

    public static final void m(String str, r71.b bVar) {
        String sb;
        k71.k.g(bVar, "baseClass");
        StringBuilder sb2 = new StringBuilder("in the polymorphic scope of '");
        k71.e eVar = (k71.e) bVar;
        sb2.append(eVar.c());
        sb2.append('\'');
        String sb3 = sb2.toString();
        if (str == null) {
            sb = no.a.i('.', "Class discriminator was missing and no default serializers were registered ", sb3);
        } else {
            StringBuilder o = a0.s0.o("Serializer for subclass '", str, "' is not found ", sb3, ".\nCheck if class with serial name '");
            f1.e.x(o, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            o.append(eVar.c());
            o.append("' has to be sealed and '@Serializable'.");
            sb = o.toString();
        }
        throw new SerializationException(sb);
    }

    public static final String n(SerialDescriptor serialDescriptor) {
        return x61.m.c0(aa1.b.b0(0, serialDescriptor.f()), ", ", serialDescriptor.a() + '(', ")", 0, new a7.o(1, serialDescriptor), 24);
    }
}
