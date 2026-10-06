package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes4.dex */
public final class q implements Iterable, n {
    public final String r;

    public q(String str) {
        if (str == null) {
            throw new IllegalArgumentException("StringValue cannot be null.");
        }
        this.r = str;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Boolean a() {
        return Boolean.valueOf(!this.r.isEmpty());
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Iterator b() {
        return new p(this, 0);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final Double d() {
        String str = this.r;
        if (str.isEmpty()) {
            return Double.valueOf(0.0d);
        }
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException unused) {
            return Double.valueOf(Double.NaN);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q) {
            return this.r.equals(((q) obj).r);
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x02ea, code lost:
    
        if (r4[r1].isEmpty() == false) goto L104;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.measurement.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final n g(String str, w51.r rVar, ArrayList arrayList) {
        String str2;
        String str3;
        String str4;
        int i;
        int i2;
        int i3;
        w51.r rVar2;
        if ("charAt".equals(str) || "concat".equals(str) || "hasOwnProperty".equals(str) || "indexOf".equals(str) || "lastIndexOf".equals(str) || "match".equals(str) || "replace".equals(str) || "search".equals(str) || "slice".equals(str) || "split".equals(str) || "substring".equals(str) || "toLowerCase".equals(str) || "toLocaleLowerCase".equals(str) || "toString".equals(str) || "toUpperCase".equals(str) || "toLocaleUpperCase".equals(str)) {
            str2 = "hasOwnProperty";
            str3 = "trim";
        } else {
            str2 = "hasOwnProperty";
            str3 = "trim";
            if (!str3.equals(str)) {
                throw new IllegalArgumentException(str.concat(" is not a String function"));
            }
        }
        int hashCode = str.hashCode();
        str4 = "undefined";
        String str5 = this.r;
        r7 = false;
        boolean z = false;
        switch (hashCode) {
            case -1789698943:
                String str6 = str2;
                if (str.equals(str6)) {
                    i21.a.U(1, str6, arrayList);
                    n c = ((t) rVar.t).c(rVar, (n) arrayList.get(0));
                    boolean equals = "length".equals(c.k());
                    e eVar = n.g;
                    if (equals) {
                        return eVar;
                    }
                    double doubleValue = c.d().doubleValue();
                    return (doubleValue != Math.floor(doubleValue) || (i = (int) doubleValue) < 0 || i >= str5.length()) ? n.h : eVar;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1776922004:
                if (str.equals("toString")) {
                    i21.a.U(0, "toString", arrayList);
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1464939364:
                if (str.equals("toLocaleLowerCase")) {
                    i21.a.U(0, "toLocaleLowerCase", arrayList);
                    return new q(str5.toLowerCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -1361633751:
                if (str.equals("charAt")) {
                    i21.a.X(1, "charAt", arrayList);
                    int c0 = arrayList.isEmpty() ? 0 : (int) i21.a.c0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue());
                    return (c0 < 0 || c0 >= str5.length()) ? n.i : new q(String.valueOf(str5.charAt(c0)));
                }
                throw new IllegalArgumentException("Command not supported");
            case -1354795244:
                if (str.equals("concat")) {
                    if (!arrayList.isEmpty()) {
                        StringBuilder sb = new StringBuilder(str5);
                        for (int i4 = 0; i4 < arrayList.size(); i4++) {
                            sb.append(((t) rVar.t).c(rVar, (n) arrayList.get(i4)).k());
                        }
                        return new q(sb.toString());
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case -1137582698:
                if (str.equals("toLowerCase")) {
                    i21.a.U(0, "toLowerCase", arrayList);
                    return new q(str5.toLowerCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case -906336856:
                if (str.equals("search")) {
                    i21.a.X(1, "search", arrayList);
                    return Pattern.compile(arrayList.isEmpty() ? "undefined" : ((t) rVar.t).c(rVar, (n) arrayList.get(0)).k()).matcher(str5).find() ? new g(Double.valueOf(r0.start())) : new g(Double.valueOf(-1.0d));
                }
                throw new IllegalArgumentException("Command not supported");
            case -726908483:
                if (str.equals("toLocaleUpperCase")) {
                    i21.a.U(0, "toLocaleUpperCase", arrayList);
                    return new q(str5.toUpperCase());
                }
                throw new IllegalArgumentException("Command not supported");
            case -467511597:
                if (str.equals("lastIndexOf")) {
                    i21.a.X(2, "lastIndexOf", arrayList);
                    String k = arrayList.size() > 0 ? ((t) rVar.t).c(rVar, (n) arrayList.get(0)).k() : "undefined";
                    return new g(Double.valueOf(str5.lastIndexOf(k, (int) (Double.isNaN(arrayList.size() < 2 ? Double.NaN : ((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue()) ? Double.POSITIVE_INFINITY : i21.a.c0(r1)))));
                }
                throw new IllegalArgumentException("Command not supported");
            case -399551817:
                if (str.equals("toUpperCase")) {
                    i21.a.U(0, "toUpperCase", arrayList);
                    return new q(str5.toUpperCase(Locale.ENGLISH));
                }
                throw new IllegalArgumentException("Command not supported");
            case 3568674:
                if (str.equals(str3)) {
                    i21.a.U(0, "toUpperCase", arrayList);
                    return new q(str5.trim());
                }
                throw new IllegalArgumentException("Command not supported");
            case 103668165:
                if (str.equals("match")) {
                    i21.a.X(1, "match", arrayList);
                    Matcher matcher = Pattern.compile(arrayList.size() <= 0 ? "" : ((t) rVar.t).c(rVar, (n) arrayList.get(0)).k()).matcher(str5);
                    return matcher.find() ? new d(Arrays.asList(new q(matcher.group()))) : n.c;
                }
                throw new IllegalArgumentException("Command not supported");
            case 109526418:
                if (str.equals("slice")) {
                    i21.a.X(2, "slice", arrayList);
                    double c02 = i21.a.c0(!arrayList.isEmpty() ? ((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue() : 0.0d);
                    double max = c02 < 0.0d ? Math.max(str5.length() + c02, 0.0d) : Math.min(c02, str5.length());
                    double c03 = i21.a.c0(arrayList.size() > 1 ? ((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue() : str5.length());
                    int i5 = (int) max;
                    return new q(str5.substring(i5, Math.max(0, ((int) (c03 < 0.0d ? Math.max(str5.length() + c03, 0.0d) : Math.min(c03, str5.length()))) - i5) + i5));
                }
                throw new IllegalArgumentException("Command not supported");
            case 109648666:
                if (str.equals("split")) {
                    i21.a.X(2, "split", arrayList);
                    if (str5.length() == 0) {
                        return new d(Arrays.asList(this));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    if (arrayList.isEmpty()) {
                        arrayList2.add(this);
                    } else {
                        String k2 = ((t) rVar.t).c(rVar, (n) arrayList.get(0)).k();
                        long b0 = arrayList.size() > 1 ? i21.a.b0(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue()) & 4294967295L : 2147483647L;
                        if (b0 == 0) {
                            return new d();
                        }
                        String[] split = str5.split(Pattern.quote(k2), ((int) b0) + 1);
                        int length = split.length;
                        if (k2.isEmpty() && length > 0) {
                            boolean isEmpty = split[0].isEmpty();
                            i2 = length - 1;
                            i3 = isEmpty;
                            z = isEmpty;
                            break;
                        }
                        i2 = length;
                        i3 = z;
                        if (length > b0) {
                            i2--;
                        }
                        while (i3 < i2) {
                            arrayList2.add(new q(split[i3]));
                            i3++;
                        }
                    }
                    return new d(arrayList2);
                }
                throw new IllegalArgumentException("Command not supported");
            case 530542161:
                if (str.equals("substring")) {
                    i21.a.X(2, "substring", arrayList);
                    int c04 = !arrayList.isEmpty() ? (int) i21.a.c0(((t) rVar.t).c(rVar, (n) arrayList.get(0)).d().doubleValue()) : 0;
                    int c05 = arrayList.size() > 1 ? (int) i21.a.c0(((t) rVar.t).c(rVar, (n) arrayList.get(1)).d().doubleValue()) : str5.length();
                    int min = Math.min(Math.max(c04, 0), str5.length());
                    int min2 = Math.min(Math.max(c05, 0), str5.length());
                    return new q(str5.substring(Math.min(min, min2), Math.max(min, min2)));
                }
                throw new IllegalArgumentException("Command not supported");
            case 1094496948:
                if (str.equals("replace")) {
                    i21.a.X(2, "replace", arrayList);
                    boolean isEmpty2 = arrayList.isEmpty();
                    n nVar = n.b;
                    if (!isEmpty2) {
                        str4 = ((t) rVar.t).c(rVar, (n) arrayList.get(0)).k();
                        if (arrayList.size() > 1) {
                            nVar = ((t) rVar.t).c(rVar, (n) arrayList.get(1));
                        }
                    }
                    String str7 = str4;
                    int indexOf = str5.indexOf(str7);
                    if (indexOf >= 0) {
                        if (nVar instanceof h) {
                            nVar = ((h) nVar).c(rVar, Arrays.asList(new q(str7), new g(Double.valueOf(indexOf)), this));
                        }
                        String substring = str5.substring(0, indexOf);
                        String k3 = nVar.k();
                        String substring2 = str5.substring(str7.length() + indexOf);
                        return new q(no.a.q(new StringBuilder(String.valueOf(substring).length() + String.valueOf(k3).length() + String.valueOf(substring2).length()), substring, k3, substring2));
                    }
                    return this;
                }
                throw new IllegalArgumentException("Command not supported");
            case 1943291465:
                if (str.equals("indexOf")) {
                    i21.a.X(2, "indexOf", arrayList);
                    if (arrayList.size() <= 0) {
                        rVar2 = rVar;
                    } else {
                        rVar2 = rVar;
                        str4 = ((t) rVar2.t).c(rVar2, (n) arrayList.get(0)).k();
                    }
                    return new g(Double.valueOf(str5.indexOf(str4, (int) i21.a.c0(arrayList.size() < 2 ? 0.0d : ((t) rVar2.t).c(rVar2, (n) arrayList.get(1)).d().doubleValue()))));
                }
                throw new IllegalArgumentException("Command not supported");
            default:
                throw new IllegalArgumentException("Command not supported");
        }
    }

    public final int hashCode() {
        return this.r.hashCode();
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new p(this, 1);
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final String k() {
        return this.r;
    }

    @Override // com.google.android.gms.internal.measurement.n
    public final n l() {
        return new q(this.r);
    }

    public final String toString() {
        String str = this.r;
        return no.a.q(new StringBuilder(str.length() + 2), "\"", str, "\"");
    }








    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class t2 {
        public t2() {
        }
    }

    public q(Object... a) {
    }
}
