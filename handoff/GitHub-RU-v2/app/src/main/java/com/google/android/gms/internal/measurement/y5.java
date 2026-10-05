package com.google.android.gms.internal.measurement;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: /home/user/work/p/classes4.dex */
public abstract class y5 {
    public static final char[] a;

    static {
        char[] cArr = new char[80];
        a = cArr;
        Arrays.fill(cArr, ' ');
    }

    public static void a(StringBuilder sb, int i, String str, Object obj) {
        if (obj instanceof List) {
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                a(sb, i, str, it.next());
            }
            return;
        }
        if (obj instanceof Map) {
            Iterator it2 = ((Map) obj).entrySet().iterator();
            while (it2.hasNext()) {
                a(sb, i, str, (Map.Entry) it2.next());
            }
            return;
        }
        sb.append('\n');
        c(i, sb);
        if (!str.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(Character.toLowerCase(str.charAt(0)));
            for (int i2 = 1; i2 < str.length(); i2++) {
                char charAt = str.charAt(i2);
                if (Character.isUpperCase(charAt)) {
                    sb2.append("_");
                }
                sb2.append(Character.toLowerCase(charAt));
            }
            str = sb2.toString();
        }
        sb.append(str);
        if (obj instanceof String) {
            sb.append(": \"");
            x4 x4Var = x4.t;
            sb.append(v8.l0.V(new x4(((String) obj).getBytes(n5.a))));
            sb.append('\"');
            return;
        }
        if (obj instanceof x4) {
            sb.append(": \"");
            sb.append(v8.l0.V((x4) obj));
            sb.append('\"');
            return;
        }
        if (obj instanceof g5) {
            sb.append(" {");
            b((g5) obj, sb, i + 2);
            sb.append("\n");
            c(i, sb);
            sb.append("}");
            return;
        }
        if (!(obj instanceof Map.Entry)) {
            sb.append(": ");
            sb.append(obj);
            return;
        }
        int i3 = i + 2;
        sb.append(" {");
        Map.Entry entry = (Map.Entry) obj;
        a(sb, i3, "key", entry.getKey());
        a(sb, i3, "value", entry.getValue());
        sb.append("\n");
        c(i, sb);
        sb.append("}");
    }

    public static void b(g5 g5Var, StringBuilder sb, int i) {
        int i2;
        int i3;
        boolean equals;
        Method method;
        Method method2;
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        Method[] declaredMethods = g5Var.getClass().getDeclaredMethods();
        int length = declaredMethods.length;
        int i4 = 0;
        while (true) {
            i2 = 3;
            if (i4 >= length) {
                break;
            }
            Method method3 = declaredMethods[i4];
            if (!Modifier.isStatic(method3.getModifiers()) && method3.getName().length() >= 3) {
                if (method3.getName().startsWith("set")) {
                    hashSet.add(method3.getName());
                } else if (Modifier.isPublic(method3.getModifiers()) && method3.getParameterTypes().length == 0) {
                    if (method3.getName().startsWith("has")) {
                        hashMap.put(method3.getName(), method3);
                    } else if (method3.getName().startsWith("get")) {
                        treeMap.put(method3.getName(), method3);
                    }
                }
            }
            i4++;
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            String substring = ((String) entry.getKey()).substring(i2);
            if (!substring.endsWith("List") || substring.endsWith("OrBuilderList") || substring.equals("List") || (method2 = (Method) entry.getValue()) == null) {
                i3 = i2;
            } else {
                i3 = i2;
                if (method2.getReturnType().equals(List.class)) {
                    a(sb, i, substring.substring(0, substring.length() - 4), g5.n(method2, g5Var, new Object[0]));
                    i2 = i3;
                }
            }
            if (substring.endsWith("Map") && !substring.equals("Map") && (method = (Method) entry.getValue()) != null && method.getReturnType().equals(Map.class) && !method.isAnnotationPresent(Deprecated.class) && Modifier.isPublic(method.getModifiers())) {
                a(sb, i, substring.substring(0, substring.length() - 3), g5.n(method, g5Var, new Object[0]));
            } else if (hashSet.contains("set".concat(substring)) && (!substring.endsWith("Bytes") || !treeMap.containsKey("get".concat(String.valueOf(substring.substring(0, substring.length() - 5)))))) {
                Method method4 = (Method) entry.getValue();
                Method method5 = (Method) hashMap.get("has".concat(substring));
                if (method4 != null) {
                    Object n = g5.n(method4, g5Var, new Object[0]);
                    if (method5 != null) {
                        if (!((Boolean) g5.n(method5, g5Var, new Object[0])).booleanValue()) {
                        }
                        a(sb, i, substring, n);
                    } else if (n instanceof Boolean) {
                        if (!((Boolean) n).booleanValue()) {
                        }
                        a(sb, i, substring, n);
                    } else if (n instanceof Integer) {
                        if (((Integer) n).intValue() == 0) {
                        }
                        a(sb, i, substring, n);
                    } else if (n instanceof Float) {
                        if (Float.floatToRawIntBits(((Float) n).floatValue()) == 0) {
                        }
                        a(sb, i, substring, n);
                    } else if (n instanceof Double) {
                        if (Double.doubleToRawLongBits(((Double) n).doubleValue()) == 0) {
                        }
                        a(sb, i, substring, n);
                    } else {
                        if (n instanceof String) {
                            equals = n.equals("");
                        } else if (n instanceof x4) {
                            equals = n.equals(x4.t);
                        } else if (n instanceof s4) {
                            if (n == ((g5) ((g5) ((s4) n)).o(6))) {
                            }
                            a(sb, i, substring, n);
                        } else {
                            if ((n instanceof Enum) && ((Enum) n).ordinal() == 0) {
                            }
                            a(sb, i, substring, n);
                        }
                        if (equals) {
                        }
                        a(sb, i, substring, n);
                    }
                }
            }
            i2 = i3;
        }
        k6 k6Var = g5Var.zzc;
        if (k6Var != null) {
            for (int i5 = 0; i5 < k6Var.a; i5++) {
                a(sb, i, String.valueOf(k6Var.b[i5] >>> 3), k6Var.c[i5]);
            }
        }
    }

    public static void c(int i, StringBuilder sb) {
        while (i > 0) {
            int i2 = 80;
            if (i <= 80) {
                i2 = i;
            }
            sb.append(a, 0, i2);
            i -= i2;
        }
    }
}
