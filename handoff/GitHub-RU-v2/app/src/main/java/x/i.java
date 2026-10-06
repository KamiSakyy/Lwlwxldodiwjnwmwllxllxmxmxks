package x;

import android.os.Bundle;
import java.time.ZonedDateTime;
import java.util.List;
import kotlin.KotlinNothingValueException;
import t00.f8;

/* loaded from: /home/user/work/p/classes.dex */
public abstract /* synthetic */ class i {
    public static float a(float f6, float f10, float f11, float f12) {
        return ((f6 - f10) * f11) + f12;
    }

    public static int b(int i, float f6, int i10) {
        return (Float.hashCode(f6) + i) * i10;
    }

    public static int c(int i, int i10, long j10) {
        return (Long.hashCode(j10) + i) * i10;
    }

    public static int d(int i, int i10, j71.a aVar) {
        return (aVar.hashCode() + i) * i10;
    }

    public static int e(int i, int i10, boolean z10) {
        return (Boolean.hashCode(z10) + i) * i10;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3, String str4, String str5) {
        return str + str2 + str3 + str4 + str5;
    }

    public static String h(String str, String str2, String str3, StringBuilder sb2, ZonedDateTime zonedDateTime) {
        sb2.append(zonedDateTime);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        return sb2.toString();
    }

    public static String i(StringBuilder sb2, float f6, char c10) {
        sb2.append(f6);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String j(StringBuilder sb2, int i, char c10) {
        sb2.append(i);
        sb2.append(c10);
        return sb2.toString();
    }

    public static String k(StringBuilder sb2, String str, String str2, String str3, String str4) {
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2.toString();
    }

    public static String l(StringBuilder sb2, List list, String str) {
        sb2.append(list);
        sb2.append(str);
        return sb2.toString();
    }

    public static StringBuilder m(int i, int i10, String str, String str2, String str3) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(i10);
        sb2.append(str3);
        return sb2;
    }

    public static StringBuilder n(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        sb2.append(str3);
        sb2.append(str4);
        return sb2;
    }

    public static StringBuilder o(String str, int i, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i);
        sb2.append(str2);
        return sb2;
    }

    public static KotlinNothingValueException p(String str) {
        t2.a.c(str);
        return new KotlinNothingValueException();
    }

    public static f8 q(String str, String str2, String str3, String str4) {
        k71.k.g(str, str2);
        k71.k.g(str3, str4);
        return sy.c0.j();
    }

    public static void r(int i, String str, String str2, String str3, StringBuilder sb2) {
        sb2.append(i);
        sb2.append(str);
        sb2.append(str2);
        sb2.append(str3);
    }

    public static boolean s(Bundle bundle, String str, String str2, String str3, String str4) {
        k71.k.g(bundle, str);
        k71.k.g(str2, str3);
        return bundle.containsKey(str4);
    }

    public static Object i;

    public static Object b(Object... a) {
        return null;
    }

    public static Object e;

    public static Object e(Object... a) {
        return null;
    }
    public Object a() { return null; }
    public Object b(Object p1, Object p2) { return null; }
    public Object c() { return null; }
    public Object d() { return null; }
}
