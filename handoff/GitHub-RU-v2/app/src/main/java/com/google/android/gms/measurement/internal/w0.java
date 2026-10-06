package com.google.android.gms.measurement.internal;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException;
import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.internal.measurement.d6;
import com.google.android.gms.internal.measurement.f5;
import com.google.android.gms.internal.measurement.l5;
import com.google.android.gms.internal.measurement.m5;
import com.google.android.gms.internal.measurement.m8;
import com.google.android.gms.internal.measurement.s5;
import com.google.android.gms.internal.measurement.z4;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.zip.GZIPOutputStream;

/* loaded from: /home/user/work/p/classes4.dex */
public final class w0 extends i4 {
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w0(o4 o4Var, int i) {
        super(o4Var);
        this.v = i;
    }

    public static w D(com.google.android.gms.internal.measurement.b bVar) {
        Object obj;
        Bundle E = E(bVar.c, true);
        String obj2 = (!E.containsKey("_o") || (obj = E.get("_o")) == null) ? "app" : obj.toString();
        String g = c2.g(bVar.a, c2.a, c2.c);
        if (g == null) {
            g = bVar.a;
        }
        return new w(g, new v(E), obj2, bVar.b);
    }

    public static Bundle E(Map map, boolean z) {
        Bundle bundle = new Bundle();
        for (String str : map.keySet()) {
            Object obj = map.get(str);
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Long) obj).longValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            } else if (!(obj instanceof ArrayList)) {
                bundle.putString(str, obj.toString());
            } else if (z) {
                ArrayList arrayList = (ArrayList) obj;
                ArrayList arrayList2 = new ArrayList();
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList2.add(E((Map) arrayList.get(i), false));
                }
                bundle.putParcelableArray(str, (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
            }
        }
        return bundle;
    }

    public static final void F(com.google.android.gms.internal.measurement.a3 a3Var, String str, Long l) {
        List i = a3Var.i();
        int i2 = 0;
        while (true) {
            if (i2 >= i.size()) {
                i2 = -1;
                break;
            } else if (str.equals(((com.google.android.gms.internal.measurement.e3) i.get(i2)).q())) {
                break;
            } else {
                i2++;
            }
        }
        com.google.android.gms.internal.measurement.d3 B = com.google.android.gms.internal.measurement.e3.B();
        B.i(str);
        B.k(l.longValue());
        if (i2 < 0) {
            a3Var.n(B);
        } else {
            a3Var.b();
            ((com.google.android.gms.internal.measurement.b3) a3Var.s).A(i2, (com.google.android.gms.internal.measurement.e3) B.e());
        }
    }

    public static final Bundle G(List list) {
        Bundle bundle = new Bundle();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            String q = e3Var.q();
            if (e3Var.x()) {
                bundle.putDouble(q, e3Var.y());
            } else if (e3Var.v()) {
                bundle.putFloat(q, e3Var.w());
            } else if (e3Var.r()) {
                bundle.putString(q, e3Var.s());
            } else if (e3Var.t()) {
                bundle.putLong(q, e3Var.u());
            }
        }
        return bundle;
    }

    public static final com.google.android.gms.internal.measurement.e3 H(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        for (com.google.android.gms.internal.measurement.e3 e3Var : b3Var.p()) {
            if (e3Var.q().equals(str)) {
                return e3Var;
            }
        }
        return null;
    }

    public static final Serializable I(com.google.android.gms.internal.measurement.b3 b3Var, String str) {
        com.google.android.gms.internal.measurement.e3 H = H(b3Var, str);
        if (H == null) {
            return null;
        }
        return O(H);
    }

    public static final void L(int i, StringBuilder sb) {
        for (int i2 = 0; i2 < i; i2++) {
            sb.append("  ");
        }
    }

    public static final void M(Uri.Builder builder, String str, String str2, Set set) {
        if (set.contains(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        builder.appendQueryParameter(str, str2);
    }

    public static final String N(boolean z, boolean z2, boolean z3) {
        StringBuilder sb = new StringBuilder();
        if (z) {
            sb.append("Dynamic ");
        }
        if (z2) {
            sb.append("Sequence ");
        }
        if (z3) {
            sb.append("Session-Scoped ");
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [android.os.Bundle[], java.io.Serializable] */
    public static final Serializable O(com.google.android.gms.internal.measurement.e3 e3Var) {
        if (e3Var.r()) {
            return e3Var.s();
        }
        if (e3Var.t()) {
            return Long.valueOf(e3Var.u());
        }
        if (e3Var.x()) {
            return Double.valueOf(e3Var.y());
        }
        if (e3Var.A() > 0) {
            return o0((m5) e3Var.z());
        }
        return null;
    }

    public static final void P(Uri.Builder builder, String[] strArr, Bundle bundle, Set set) {
        for (String str : strArr) {
            String[] split = str.split(",");
            String str2 = split[0];
            String str3 = split[split.length - 1];
            String string = bundle.getString(str2);
            if (string != null) {
                M(builder, str3, string, set);
            }
        }
    }

    public static final void Q(StringBuilder sb, String str, com.google.android.gms.internal.measurement.m3 m3Var) {
        if (m3Var == null) {
            return;
        }
        L(3, sb);
        sb.append(str);
        sb.append(" {\n");
        if (m3Var.s() != 0) {
            L(4, sb);
            sb.append("results: ");
            int i = 0;
            for (Long l : m3Var.r()) {
                int i2 = i + 1;
                if (i != 0) {
                    sb.append(", ");
                }
                sb.append(l);
                i = i2;
            }
            sb.append('\n');
        }
        if (m3Var.q() != 0) {
            L(4, sb);
            sb.append("status: ");
            int i3 = 0;
            for (Long l2 : m3Var.p()) {
                int i4 = i3 + 1;
                if (i3 != 0) {
                    sb.append(", ");
                }
                sb.append(l2);
                i3 = i4;
            }
            sb.append('\n');
        }
        if (m3Var.u() != 0) {
            L(4, sb);
            sb.append("dynamic_filter_timestamps: {");
            int i5 = 0;
            for (com.google.android.gms.internal.measurement.z2 z2Var : m3Var.t()) {
                int i6 = i5 + 1;
                if (i5 != 0) {
                    sb.append(", ");
                }
                sb.append(z2Var.p() ? Integer.valueOf(z2Var.q()) : null);
                sb.append(":");
                sb.append(z2Var.r() ? Long.valueOf(z2Var.s()) : null);
                i5 = i6;
            }
            sb.append("}\n");
        }
        if (m3Var.w() != 0) {
            L(4, sb);
            sb.append("sequence_filter_timestamps: {");
            int i7 = 0;
            for (com.google.android.gms.internal.measurement.o3 o3Var : m3Var.v()) {
                int i8 = i7 + 1;
                if (i7 != 0) {
                    sb.append(", ");
                }
                sb.append(o3Var.p() ? Integer.valueOf(o3Var.q()) : null);
                sb.append(": [");
                Iterator it = o3Var.r().iterator();
                int i9 = 0;
                while (it.hasNext()) {
                    long longValue = ((Long) it.next()).longValue();
                    int i10 = i9 + 1;
                    if (i9 != 0) {
                        sb.append(", ");
                    }
                    sb.append(longValue);
                    i9 = i10;
                }
                sb.append("]");
                i7 = i8;
            }
            sb.append("}\n");
        }
        L(3, sb);
        sb.append("}\n");
    }

    public static final void R(StringBuilder sb, int i, String str, Object obj) {
        if (obj == null) {
            return;
        }
        L(i + 1, sb);
        sb.append(str);
        sb.append(": ");
        sb.append(obj);
        sb.append('\n');
    }

    public static final void S(StringBuilder sb, int i, String str, com.google.android.gms.internal.measurement.t1 t1Var) {
        if (t1Var == null) {
            return;
        }
        L(i, sb);
        sb.append(str);
        sb.append(" {\n");
        if (t1Var.p()) {
            int z = t1Var.z();
            R(sb, i, "comparison_type", z != 1 ? z != 2 ? z != 3 ? z != 4 ? "BETWEEN" : "EQUAL" : "GREATER_THAN" : "LESS_THAN" : "UNKNOWN_COMPARISON_TYPE");
        }
        if (t1Var.q()) {
            R(sb, i, "match_as_float", Boolean.valueOf(t1Var.r()));
        }
        if (t1Var.s()) {
            R(sb, i, "comparison_value", t1Var.t());
        }
        if (t1Var.u()) {
            R(sb, i, "min_comparison_value", t1Var.v());
        }
        if (t1Var.w()) {
            R(sb, i, "max_comparison_value", t1Var.x());
        }
        L(i, sb);
        sb.append("}\n");
    }

    private final void U() {
    }

    private final void V() {
    }

    private final void W() {
    }

    public static boolean f0(String str) {
        return str != null && str.matches("([+-])?([0-9]+\\.?[0-9]*|[0-9]*\\.?[0-9]+)") && str.length() <= 310;
    }

    public static boolean g0(l5 l5Var, int i) {
        if (i < ((s5) l5Var).t * 64) {
            return ((1 << (i % 64)) & ((Long) ((s5) l5Var).get(i / 64)).longValue()) != 0;
        }
        return false;
    }

    public static ArrayList h0(BitSet bitSet) {
        int length = (bitSet.length() + 63) / 64;
        ArrayList arrayList = new ArrayList(length);
        for (int i = 0; i < length; i++) {
            long j = 0;
            for (int i2 = 0; i2 < 64; i2++) {
                int i3 = (i * 64) + i2;
                if (i3 >= bitSet.length()) {
                    break;
                }
                if (bitSet.get(i3)) {
                    j |= 1 << i2;
                }
            }
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    public static f5 m0(f5 f5Var, byte[] bArr) {
        z4 z4Var;
        z4 z4Var2 = z4.a;
        if (z4Var2 == null) {
            synchronized (z4.class) {
                try {
                    z4Var = z4.a;
                    if (z4Var == null) {
                        d6 d6Var = d6.c;
                        z4Var = d5.l0();
                        z4.a = z4Var;
                    }
                } finally {
                }
            }
            z4Var2 = z4Var;
        }
        if (z4Var2 != null) {
            f5Var.getClass();
            f5Var.h(bArr, bArr.length, z4Var2);
            return f5Var;
        }
        f5Var.getClass();
        int length = bArr.length;
        z4 z4Var3 = z4.a;
        d6 d6Var2 = d6.c;
        f5Var.h(bArr, length, z4.b);
        return f5Var;
    }

    public static int n0(com.google.android.gms.internal.measurement.i3 i3Var, String str) {
        for (int i = 0; i < ((com.google.android.gms.internal.measurement.j3) i3Var.s).V1(); i++) {
            if (str.equals(((com.google.android.gms.internal.measurement.j3) i3Var.s).W1(i).r())) {
                return i;
            }
        }
        return -1;
    }

    public static Bundle[] o0(m5 m5Var) {
        ArrayList arrayList = new ArrayList();
        Iterator it = m5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            if (e3Var != null) {
                Bundle bundle = new Bundle();
                for (com.google.android.gms.internal.measurement.e3 e3Var2 : e3Var.z()) {
                    if (e3Var2.r()) {
                        bundle.putString(e3Var2.q(), e3Var2.s());
                    } else if (e3Var2.t()) {
                        bundle.putLong(e3Var2.q(), e3Var2.u());
                    } else if (e3Var2.x()) {
                        bundle.putDouble(e3Var2.q(), e3Var2.y());
                    }
                }
                if (!bundle.isEmpty()) {
                    arrayList.add(bundle);
                }
            }
        }
        return (Bundle[]) arrayList.toArray(new Bundle[arrayList.size()]);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0032, code lost:
    
        r5 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0038, code lost:
    
        if (r4 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003a, code lost:
    
        r3 = (android.os.Parcelable[]) r3;
        r4 = r3.length;
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003e, code lost:
    
        if (r7 >= r4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0040, code lost:
    
        r8 = r3[r7];
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        r5.add(p0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0080, code lost:
    
        r0.put(r2, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0054, code lost:
    
        if ((r3 instanceof java.util.ArrayList) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0056, code lost:
    
        r3 = (java.util.ArrayList) r3;
        r4 = r3.size();
        r7 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005d, code lost:
    
        if (r7 >= r4) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005f, code lost:
    
        r8 = r3.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0065, code lost:
    
        if ((r8 instanceof android.os.Bundle) == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0067, code lost:
    
        r5.add(p0((android.os.Bundle) r8, false));
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        r7 = r7 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0075, code lost:
    
        if ((r3 instanceof android.os.Bundle) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0077, code lost:
    
        r5.add(p0((android.os.Bundle) r3, false));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static HashMap p0(Bundle bundle, boolean z) {
        HashMap hashMap = new HashMap();
        Iterator<String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            String next = it.next();
            Object obj = bundle.get(next);
            boolean z2 = obj instanceof Parcelable[];
            if (!z2 && !(obj instanceof ArrayList) && !(obj instanceof Bundle)) {
                if (obj != null) {
                    hashMap.put(next, obj);
                }
            }
        }
        return hashMap;
    }

    @Override // com.google.android.gms.measurement.internal.i4
    public final void C() {
        int i = this.v;
    }

    public void J(StringBuilder sb, int i, m5 m5Var) {
        if (m5Var == null) {
            return;
        }
        int i2 = i + 1;
        Iterator it = m5Var.iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.measurement.e3 e3Var = (com.google.android.gms.internal.measurement.e3) it.next();
            if (e3Var != null) {
                L(i2, sb);
                sb.append("param {\n");
                R(sb, i2, "name", e3Var.p() ? ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).A.b(e3Var.q()) : null);
                R(sb, i2, "string_value", e3Var.r() ? e3Var.s() : null);
                R(sb, i2, "int_value", e3Var.t() ? Long.valueOf(e3Var.u()) : null);
                R(sb, i2, "double_value", e3Var.x() ? Double.valueOf(e3Var.y()) : null);
                if (e3Var.A() > 0) {
                    J(sb, i2, (m5) e3Var.z());
                }
                L(i2, sb);
                sb.append("}\n");
            }
        }
    }

    public void K(StringBuilder sb, int i, com.google.android.gms.internal.measurement.q1 q1Var) {
        String str;
        if (q1Var == null) {
            return;
        }
        L(i, sb);
        sb.append("filter {\n");
        if (q1Var.t()) {
            R(sb, i, "complement", Boolean.valueOf(q1Var.u()));
        }
        if (q1Var.v()) {
            R(sb, i, "param_name", ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).A.b(q1Var.w()));
        }
        if (q1Var.p()) {
            int i2 = i + 1;
            com.google.android.gms.internal.measurement.w1 q = q1Var.q();
            if (q != null) {
                L(i2, sb);
                sb.append("string_filter {\n");
                if (q.pShadow()) {
                    switch (q.x()) {
                        case 1:
                            str = "UNKNOWN_MATCH_TYPE";
                            break;
                        case 2:
                            str = "REGEXP";
                            break;
                        case 3:
                            str = "BEGINS_WITH";
                            break;
                        case 4:
                            str = "ENDS_WITH";
                            break;
                        case 5:
                            str = "PARTIAL";
                            break;
                        case 6:
                            str = "EXACT";
                            break;
                        default:
                            str = "IN_LIST";
                            break;
                    }
                    R(sb, i2, "match_type", str);
                }
                if (q.q()) {
                    R(sb, i2, "expression", q.r());
                }
                if (q.s()) {
                    R(sb, i2, "case_sensitive", Boolean.valueOf(q.t()));
                }
                if (q.v() > 0) {
                    L(i + 2, sb);
                    sb.append("expression_list {\n");
                    for (String str2 : q.u()) {
                        L(i + 3, sb);
                        sb.append(str2);
                        sb.append("\n");
                    }
                    sb.append("}\n");
                }
                L(i2, sb);
                sb.append("}\n");
            }
        }
        if (q1Var.r()) {
            S(sb, i + 1, "number_filter", q1Var.s());
        }
        L(i, sb);
        sb.append("}\n");
    }

    public boolean T() {
        A();
        ConnectivityManager connectivityManager = (ConnectivityManager) ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).r.getSystemService("connectivity");
        NetworkInfo networkInfo = null;
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        return networkInfo != null && networkInfo.isConnected();
    }

    public void X(com.google.android.gms.internal.measurement.r3 r3Var, Object obj) {
        c21.uShadow.g(obj);
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.s).E();
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.s).G();
        r3Var.b();
        ((com.google.android.gms.internal.measurement.s3) r3Var.s).I();
        if (obj instanceof String) {
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.s).D((String) obj);
        } else if (obj instanceof Long) {
            long longValue = ((Long) obj).longValue();
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.s).F(longValue);
        } else if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            r3Var.b();
            ((com.google.android.gms.internal.measurement.s3) r3Var.s).H(doubleValue);
        } else {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.x.b(obj, "Ignoring invalid (type) user attribute value");
        }
    }

    public void Y(String str, j4 j4Var, com.google.android.gms.internal.measurement.h3 h3Var, u0 u0Var) {
        String str2;
        URL url;
        byte[] a;
        m1 m1Var;
        Map map;
        String str3 = j4Var.a;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        z();
        A();
        try {
            url = new URI(str3).toURL();
            this.t.j0();
            a = h3Var.a();
            m1Var = o1Var.x;
            o1.m(m1Var);
            map = j4Var.b;
            if (map == null) {
                map = Collections.EMPTY_MAP;
            }
            str2 = str;
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused) {
            str2 = str;
        }
        try {
            m1Var.L(new v0(this, str2, url, a, map, u0Var));
        } catch (IllegalArgumentException | MalformedURLException | URISyntaxException unused2) {
            s0 s0Var = o1Var.w;
            o1.m(s0Var);
            s0Var.x.c("Failed to parse URL. Not uploading MeasurementBatch. appId", s0.H(str2), str3);
        }
    }

    public void Z(com.google.android.gms.internal.measurement.d3 d3Var, Object obj) {
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.s).E();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.s).G();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.s).I();
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.s).L();
        if (obj instanceof String) {
            d3Var.j((String) obj);
            return;
        }
        if (obj instanceof Long) {
            d3Var.k(((Long) obj).longValue());
            return;
        }
        if (obj instanceof Double) {
            double doubleValue = ((Double) obj).doubleValue();
            d3Var.b();
            ((com.google.android.gms.internal.measurement.e3) d3Var.s).H(doubleValue);
            return;
        }
        if (!(obj instanceof Bundle[])) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.x.b(obj, "Ignoring invalid (type) event param value");
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : (Bundle[]) obj) {
            if (bundle != null) {
                com.google.android.gms.internal.measurement.d3 B = com.google.android.gms.internal.measurement.e3.B();
                for (String str : bundle.keySet()) {
                    com.google.android.gms.internal.measurement.d3 B2 = com.google.android.gms.internal.measurement.e3.B();
                    B2.i(str);
                    Object obj2 = bundle.get(str);
                    if (obj2 instanceof Long) {
                        B2.k(((Long) obj2).longValue());
                    } else if (obj2 instanceof String) {
                        B2.j((String) obj2);
                    } else if (obj2 instanceof Double) {
                        double doubleValue2 = ((Double) obj2).doubleValue();
                        B2.b();
                        ((com.google.android.gms.internal.measurement.e3) B2.s).H(doubleValue2);
                    }
                    B.b();
                    ((com.google.android.gms.internal.measurement.e3) B.s).J((com.google.android.gms.internal.measurement.e3) B2.e());
                }
                if (((com.google.android.gms.internal.measurement.e3) B.s).A() > 0) {
                    arrayList.add((com.google.android.gms.internal.measurement.e3) B.e());
                }
            }
        }
        d3Var.b();
        ((com.google.android.gms.internal.measurement.e3) d3Var.s).K(arrayList);
    }

    public c4 a0(String str, com.google.android.gms.internal.measurement.i3 i3Var, com.google.android.gms.internal.measurement.a3 a3Var, String str2) {
        int indexOf;
        m8.a();
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        h hVar = o1Var.u;
        if (!hVar.J(str, c0.P0)) {
            return null;
        }
        o1Var.B.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        String[] split = hVar.F(str, c0.u0).split(",");
        HashSet hashSet = new HashSet(split.length);
        for (String str3 : split) {
            Objects.requireNonNull(str3);
            if (!hashSet.add(str3)) {
                throw new IllegalArgumentException("duplicate element: " + ((Object) str3));
            }
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        o4 o4Var = this.t;
        k4 k4Var = o4Var.A;
        i1 i1Var = o4Var.r;
        i1 i1Var2 = k4Var.t.r;
        o4.U(i1Var2);
        String M = i1Var2.M(str);
        Uri.Builder builder = new Uri.Builder();
        h hVar2 = ((o1) ((androidx.compose.foundation.lazy.layout.s0) k4Var).s).u;
        builder.scheme(hVar2.F(str, c0.n0));
        if (TextUtils.isEmpty(M)) {
            builder.authority(hVar2.F(str, c0.o0));
        } else {
            String F = hVar2.F(str, c0.o0);
            StringBuilder sb = new StringBuilder(String.valueOf(M).length() + 1 + String.valueOf(F).length());
            sb.append(M);
            sb.append(".");
            sb.append(F);
            builder.authority(sb.toString());
        }
        builder.path(hVar2.F(str, c0.p0));
        M(builder, "gmp_app_id", ((com.google.android.gms.internal.measurement.j3) i3Var.s).E(), unmodifiableSet);
        hVar.E();
        M(builder, "gmp_version", String.valueOf(133005L), unmodifiableSet);
        String y = ((com.google.android.gms.internal.measurement.j3) i3Var.s).y();
        b0 b0Var = c0.S0;
        if (hVar.J(str, b0Var)) {
            o4.U(i1Var);
            if (i1Var.S(str)) {
                y = "";
            }
        }
        M(builder, "app_instance_id", y, unmodifiableSet);
        M(builder, "rdid", ((com.google.android.gms.internal.measurement.j3) i3Var.s).v(), unmodifiableSet);
        M(builder, "bundle_id", i3Var.q(), unmodifiableSet);
        String p = a3Var.p();
        String g = c2.g(p, c2.c, c2.a);
        if (true != TextUtils.isEmpty(g)) {
            p = g;
        }
        M(builder, "app_event_name", p, unmodifiableSet);
        M(builder, "app_version", String.valueOf(((com.google.android.gms.internal.measurement.j3) i3Var.s).K()), unmodifiableSet);
        String i2 = ((com.google.android.gms.internal.measurement.j3) i3Var.s).i2();
        if (hVar.J(str, b0Var)) {
            o4.U(i1Var);
            if (i1Var.R(str) && !TextUtils.isEmpty(i2) && (indexOf = i2.indexOf(".")) != -1) {
                i2 = i2.substring(0, indexOf);
            }
        }
        M(builder, "os_version", i2, unmodifiableSet);
        M(builder, "timestamp", String.valueOf(a3Var.q()), unmodifiableSet);
        if (((com.google.android.gms.internal.measurement.j3) i3Var.s).x()) {
            M(builder, "lat", "1", unmodifiableSet);
        }
        M(builder, "privacy_sandbox_version", String.valueOf(((com.google.android.gms.internal.measurement.j3) i3Var.s).G0()), unmodifiableSet);
        M(builder, "trigger_uri_source", "1", unmodifiableSet);
        M(builder, "trigger_uri_timestamp", String.valueOf(currentTimeMillis), unmodifiableSet);
        M(builder, "request_uuid", str2, unmodifiableSet);
        List<com.google.android.gms.internal.measurement.e3> i = a3Var.i();
        Bundle bundle = new Bundle();
        for (com.google.android.gms.internal.measurement.e3 e3Var : i) {
            String q = e3Var.q();
            if (e3Var.x()) {
                bundle.putString(q, String.valueOf(e3Var.y()));
            } else if (e3Var.v()) {
                bundle.putString(q, String.valueOf(e3Var.w()));
            } else if (e3Var.r()) {
                bundle.putString(q, e3Var.s());
            } else if (e3Var.t()) {
                bundle.putString(q, String.valueOf(e3Var.u()));
            }
        }
        P(builder, hVar.F(str, c0.t0).split("\\|"), bundle, unmodifiableSet);
        List<com.google.android.gms.internal.measurement.s3> unmodifiableList = Collections.unmodifiableList(((com.google.android.gms.internal.measurement.j3) i3Var.s).U1());
        Bundle bundle2 = new Bundle();
        for (com.google.android.gms.internal.measurement.s3 s3Var : unmodifiableList) {
            String r = s3Var.r();
            if (s3Var.y()) {
                bundle2.putString(r, String.valueOf(s3Var.z()));
            } else if (s3Var.w()) {
                bundle2.putString(r, String.valueOf(s3Var.x()));
            } else if (s3Var.s()) {
                bundle2.putString(r, s3Var.t());
            } else if (s3Var.u()) {
                bundle2.putString(r, String.valueOf(s3Var.v()));
            }
        }
        P(builder, hVar.F(str, c0.s0).split("\\|"), bundle2, unmodifiableSet);
        M(builder, "dma", true != ((com.google.android.gms.internal.measurement.j3) i3Var.s).D0() ? "0" : "1", unmodifiableSet);
        if (!((com.google.android.gms.internal.measurement.j3) i3Var.s).F0().isEmpty()) {
            M(builder, "dma_cps", ((com.google.android.gms.internal.measurement.j3) i3Var.s).F0(), unmodifiableSet);
        }
        if (((com.google.android.gms.internal.measurement.j3) i3Var.s).L0()) {
            com.google.android.gms.internal.measurement.o2 M0 = ((com.google.android.gms.internal.measurement.j3) i3Var.s).M0();
            if (!M0.z().isEmpty()) {
                M(builder, "dl_gclid", M0.z(), unmodifiableSet);
            }
            if (!M0.B().isEmpty()) {
                M(builder, "dl_gbraid", M0.B(), unmodifiableSet);
            }
            if (!M0.D().isEmpty()) {
                M(builder, "dl_gs", M0.D(), unmodifiableSet);
            }
            if (M0.F() > 0) {
                M(builder, "dl_ss_ts", String.valueOf(M0.F()), unmodifiableSet);
            }
            if (!M0.H().isEmpty()) {
                M(builder, "mr_gclid", M0.H(), unmodifiableSet);
            }
            if (!M0.J().isEmpty()) {
                M(builder, "mr_gbraid", M0.J(), unmodifiableSet);
            }
            if (!M0.L().isEmpty()) {
                M(builder, "mr_gs", M0.L(), unmodifiableSet);
            }
            if (M0.N() > 0) {
                M(builder, "mr_click_ts", String.valueOf(M0.N()), unmodifiableSet);
            }
        }
        return new c4(1, currentTimeMillis, builder.build().toString());
    }

    public com.google.android.gms.internal.measurement.b3 b0(s sVar) {
        com.google.android.gms.internal.measurement.a3 z = com.google.android.gms.internal.measurement.b3.z();
        long j = sVar.t;
        z.b();
        ((com.google.android.gms.internal.measurement.b3) z.s).H(j);
        v vVar = (v) sVar.x;
        Objects.requireNonNull(vVar);
        Bundle bundle = vVar.r;
        for (String str : bundle.keySet()) {
            com.google.android.gms.internal.measurement.d3 B = com.google.android.gms.internal.measurement.e3.B();
            B.i(str);
            Object obj = bundle.get(str);
            c21.uShadow.g(obj);
            Z(B, obj);
            z.n(B);
        }
        String str2 = (String) sVar.w;
        if (!TextUtils.isEmpty(str2) && bundle.get("_o") == null) {
            com.google.android.gms.internal.measurement.d3 B2 = com.google.android.gms.internal.measurement.e3.B();
            B2.i("_o");
            B2.j(str2);
            z.l((com.google.android.gms.internal.measurement.e3) B2.e());
        }
        return (com.google.android.gms.internal.measurement.b3) z.e();
    }

    public String c0(com.google.android.gms.internal.measurement.h3 h3Var) {
        com.google.android.gms.internal.measurement.r2 I0;
        StringBuilder p = f1.e.p("\nbatch {\n");
        if (h3Var.u()) {
            R(p, 0, "upload_subdomain", h3Var.v());
        }
        if (h3Var.s()) {
            R(p, 0, "sgtm_join_id", h3Var.t());
        }
        for (com.google.android.gms.internal.measurement.j3 j3Var : h3Var.p()) {
            if (j3Var != null) {
                L(1, p);
                p.append("bundle {\n");
                if (j3Var.P()) {
                    R(p, 1, "protocol_version", Integer.valueOf(j3Var.P0()));
                }
                o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
                h hVar = o1Var.u;
                n0 n0Var = o1Var.A;
                if (hVar.J(j3Var.p(), c0.M0) && j3Var.v0()) {
                    R(p, 1, "session_stitching_token", j3Var.w0());
                }
                R(p, 1, "platform", j3Var.h2());
                if (j3Var.r()) {
                    R(p, 1, "gmp_version", Long.valueOf(j3Var.s()));
                }
                if (j3Var.t()) {
                    R(p, 1, "uploading_gmp_version", Long.valueOf(j3Var.u()));
                }
                if (j3Var.r0()) {
                    R(p, 1, "dynamite_version", Long.valueOf(j3Var.s0()));
                }
                if (j3Var.L()) {
                    R(p, 1, "config_version", Long.valueOf(j3Var.M()));
                }
                R(p, 1, "gmp_app_id", j3Var.E());
                R(p, 1, "app_id", j3Var.p());
                R(p, 1, "app_version", j3Var.q());
                if (j3Var.J()) {
                    R(p, 1, "app_version_major", Integer.valueOf(j3Var.K()));
                }
                R(p, 1, "firebase_instance_id", j3Var.I());
                if (j3Var.z()) {
                    R(p, 1, "dev_cert_hash", Long.valueOf(j3Var.A()));
                }
                R(p, 1, "app_store", j3Var.n2());
                if (j3Var.X1()) {
                    R(p, 1, "upload_timestamp_millis", Long.valueOf(j3Var.Y1()));
                }
                if (j3Var.Z1()) {
                    R(p, 1, "start_timestamp_millis", Long.valueOf(j3Var.a2()));
                }
                if (j3Var.b2()) {
                    R(p, 1, "end_timestamp_millis", Long.valueOf(j3Var.c2()));
                }
                if (j3Var.d2()) {
                    R(p, 1, "previous_bundle_start_timestamp_millis", Long.valueOf(j3Var.e2()));
                }
                if (j3Var.f2()) {
                    R(p, 1, "previous_bundle_end_timestamp_millis", Long.valueOf(j3Var.g2()));
                }
                R(p, 1, "app_instance_id", j3Var.y());
                R(p, 1, "resettable_device_id", j3Var.v());
                R(p, 1, "ds_id", j3Var.O());
                if (j3Var.w()) {
                    R(p, 1, "limited_ad_tracking", Boolean.valueOf(j3Var.x()));
                }
                R(p, 1, "os_version", j3Var.i2());
                R(p, 1, "device_model", j3Var.j2());
                R(p, 1, "user_default_language", j3Var.k2());
                if (j3Var.l2()) {
                    R(p, 1, "time_zone_offset_minutes", Integer.valueOf(j3Var.m2()));
                }
                if (j3Var.B()) {
                    R(p, 1, "bundle_sequential_index", Integer.valueOf(j3Var.C()));
                }
                if (j3Var.J0()) {
                    R(p, 1, "delivery_index", Integer.valueOf(j3Var.K0()));
                }
                if (j3Var.F()) {
                    R(p, 1, "service_upload", Boolean.valueOf(j3Var.G()));
                }
                R(p, 1, "health_monitor", j3Var.D());
                if (j3Var.p0()) {
                    R(p, 1, "retry_counter", Integer.valueOf(j3Var.q0()));
                }
                if (j3Var.t0()) {
                    R(p, 1, "consent_signals", j3Var.u0());
                }
                if (j3Var.C0()) {
                    R(p, 1, "is_dma_region", Boolean.valueOf(j3Var.D0()));
                }
                if (j3Var.E0()) {
                    R(p, 1, "core_platform_services", j3Var.F0());
                }
                if (j3Var.A0()) {
                    R(p, 1, "consent_diagnostics", j3Var.B0());
                }
                if (j3Var.x0()) {
                    R(p, 1, "target_os_version", Long.valueOf(j3Var.y0()));
                }
                m8.a();
                if (o1Var.u.J(j3Var.p(), c0.P0)) {
                    R(p, 1, "ad_services_version", Integer.valueOf(j3Var.G0()));
                    if (j3Var.H0() && (I0 = j3Var.I0()) != null) {
                        L(2, p);
                        p.append("attribution_eligibility_status {\n");
                        R(p, 2, "eligible", Boolean.valueOf(I0.p()));
                        R(p, 2, "no_access_adservices_attribution_permission", Boolean.valueOf(I0.q()));
                        R(p, 2, "pre_r", Boolean.valueOf(I0.r()));
                        R(p, 2, "r_extensions_too_old", Boolean.valueOf(I0.s()));
                        R(p, 2, "adservices_extension_too_old", Boolean.valueOf(I0.t()));
                        R(p, 2, "ad_storage_not_allowed", Boolean.valueOf(I0.u()));
                        R(p, 2, "measurement_manager_disabled", Boolean.valueOf(I0.v()));
                        L(2, p);
                        p.append("}\n");
                    }
                }
                if (j3Var.L0()) {
                    com.google.android.gms.internal.measurement.o2 M0 = j3Var.M0();
                    L(2, p);
                    p.append("ad_campaign_info {\n");
                    if (M0.y()) {
                        R(p, 2, "deep_link_gclid", M0.z());
                    }
                    if (M0.A()) {
                        R(p, 2, "deep_link_gbraid", M0.B());
                    }
                    if (M0.C()) {
                        R(p, 2, "deep_link_gad_source", M0.D());
                    }
                    if (M0.E()) {
                        R(p, 2, "deep_link_session_millis", Long.valueOf(M0.F()));
                    }
                    if (M0.G()) {
                        R(p, 2, "market_referrer_gclid", M0.H());
                    }
                    if (M0.I()) {
                        R(p, 2, "market_referrer_gbraid", M0.J());
                    }
                    if (M0.K()) {
                        R(p, 2, "market_referrer_gad_source", M0.L());
                    }
                    if (M0.M()) {
                        R(p, 2, "market_referrer_click_millis", Long.valueOf(M0.N()));
                    }
                    L(2, p);
                    p.append("}\n");
                }
                if (j3Var.Q()) {
                    R(p, 1, "batching_timestamp_millis", Long.valueOf(j3Var.R()));
                }
                if (j3Var.N0()) {
                    com.google.android.gms.internal.measurement.q3 O0 = j3Var.O0();
                    L(2, p);
                    p.append("sgtm_diagnostics {\n");
                    int t = O0.t();
                    R(p, 2, "upload_type", t != 1 ? t != 2 ? t != 3 ? t != 4 ? "SDK_SERVICE_UPLOAD" : "PACKAGE_SERVICE_UPLOAD" : "SDK_CLIENT_UPLOAD" : "GA_UPLOAD" : "UPLOAD_TYPE_UNKNOWN");
                    R(p, 2, "client_upload_eligibility", com.github.rudroid.copilot.h1.F(O0.p()));
                    int u = O0.u();
                    R(p, 2, "service_upload_eligibility", u != 1 ? u != 2 ? u != 3 ? u != 4 ? u != 5 ? "NON_PLAY_MISSING_SGTM_SERVER_URL" : "MISSING_SGTM_PROXY_INFO" : "MISSING_SGTM_SETTINGS" : "NOT_IN_ROLLOUT" : "SERVICE_UPLOAD_ELIGIBLE" : "SERVICE_UPLOAD_ELIGIBILITY_UNKNOWN");
                    L(2, p);
                    p.append("}\n");
                }
                if (j3Var.S()) {
                    com.google.android.gms.internal.measurement.x2 T = j3Var.T();
                    L(2, p);
                    p.append("consent_info_extra {\n");
                    for (com.google.android.gms.internal.measurement.w2 w2Var : T.p()) {
                        L(3, p);
                        p.append("limited_data_modes {\n");
                        int q = w2Var.q();
                        R(p, 3, "type", q != 1 ? q != 2 ? q != 3 ? q != 4 ? "AD_PERSONALIZATION" : "AD_USER_DATA" : "ANALYTICS_STORAGE" : "AD_STORAGE" : "CONSENT_TYPE_UNSPECIFIED");
                        int r = w2Var.r();
                        R(p, 3, "mode", r != 1 ? r != 2 ? "NO_DATA_MODE" : "LIMITED_MODE" : "NOT_LIMITED");
                        L(3, p);
                        p.append("}\n");
                    }
                    L(2, p);
                    p.append("}\n");
                }
                m5 U1 = j3Var.U1();
                if (U1 != null) {
                    for (com.google.android.gms.internal.measurement.s3 s3Var : U1) {
                        if (s3Var != null) {
                            L(2, p);
                            p.append("user_property {\n");
                            R(p, 2, "set_timestamp_millis", s3Var.p() ? Long.valueOf(s3Var.q()) : null);
                            R(p, 2, "name", n0Var.c(s3Var.r()));
                            R(p, 2, "string_value", s3Var.t());
                            R(p, 2, "int_value", s3Var.u() ? Long.valueOf(s3Var.v()) : null);
                            R(p, 2, "double_value", s3Var.y() ? Double.valueOf(s3Var.z()) : null);
                            L(2, p);
                            p.append("}\n");
                        }
                    }
                }
                m5 H = j3Var.H();
                if (H != null) {
                    for (com.google.android.gms.internal.measurement.t2 t2Var : H) {
                        if (t2Var != null) {
                            L(2, p);
                            p.append("audience_membership {\n");
                            if (t2Var.p()) {
                                R(p, 2, "audience_id", Integer.valueOf(t2Var.q()));
                            }
                            if (t2Var.u()) {
                                R(p, 2, "new_audience", Boolean.valueOf(t2Var.v()));
                            }
                            Q(p, "current_data", t2Var.r());
                            if (t2Var.s()) {
                                Q(p, "previous_data", t2Var.t());
                            }
                            L(2, p);
                            p.append("}\n");
                        }
                    }
                }
                List<com.google.android.gms.internal.measurement.b3> P1 = j3Var.P1();
                if (P1 != null) {
                    for (com.google.android.gms.internal.measurement.b3 b3Var : P1) {
                        if (b3Var != null) {
                            L(2, p);
                            p.append("event {\n");
                            R(p, 2, "name", n0Var.a(b3Var.s()));
                            if (b3Var.t()) {
                                R(p, 2, "timestamp_millis", Long.valueOf(b3Var.u()));
                            }
                            if (b3Var.v()) {
                                R(p, 2, "previous_timestamp_millis", Long.valueOf(b3Var.w()));
                            }
                            if (b3Var.x()) {
                                R(p, 2, "count", Integer.valueOf(b3Var.y()));
                            }
                            if (b3Var.q() != 0) {
                                J(p, 2, (m5) b3Var.p());
                            }
                            L(2, p);
                            p.append("}\n");
                        }
                    }
                }
                L(1, p);
                p.append("}\n");
            }
        }
        p.append("} // End-of-batch\n");
        return p.toString();
    }

    public String d0(com.google.android.gms.internal.measurement.v1 v1Var) {
        StringBuilder p = f1.e.p("\nproperty_filter {\n");
        if (v1Var.p()) {
            R(p, 0, "filter_id", Integer.valueOf(v1Var.q()));
        }
        R(p, 0, "property_name", ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).A.c(v1Var.r()));
        String N = N(v1Var.t(), v1Var.u(), v1Var.w());
        if (!N.isEmpty()) {
            R(p, 0, "filter_type", N);
        }
        K(p, 1, v1Var.s());
        p.append("}\n");
        return p.toString();
    }

    public Parcelable e0(byte[] bArr, Parcelable.Creator creator) {
        Parcelable parcelable = null;
        if (bArr == null) {
            return null;
        }
        Parcel obtain = Parcel.obtain();
        try {
            try {
                obtain.unmarshall(bArr, 0, bArr.length);
                obtain.setDataPosition(0);
                parcelable = (Parcelable) creator.createFromParcel(obtain);
            } catch (SafeParcelReader$ParseException unused) {
                s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
                o1.m(s0Var);
                s0Var.x.a("Failed to load parcelable from buffer");
            }
            return parcelable;
        } finally {
            obtain.recycle();
        }
    }

    public List i0(l5 l5Var, List list) {
        int i;
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        ArrayList arrayList = new ArrayList(l5Var);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            if (num.intValue() < 0) {
                s0 s0Var = o1Var.w;
                o1.m(s0Var);
                s0Var.A.b(num, "Ignoring negative bit index to be cleared");
            } else {
                int intValue = num.intValue() / 64;
                if (intValue >= arrayList.size()) {
                    s0 s0Var2 = o1Var.w;
                    o1.m(s0Var2);
                    s0Var2.A.c("Ignoring bit index greater than bitSet size", num, Integer.valueOf(arrayList.size()));
                } else {
                    arrayList.set(intValue, Long.valueOf(((Long) arrayList.get(intValue)).longValue() & (~(1 << (num.intValue() % 64)))));
                }
            }
        }
        int size = arrayList.size();
        int size2 = arrayList.size() - 1;
        while (true) {
            int i2 = size2;
            i = size;
            size = i2;
            if (size < 0 || ((Long) arrayList.get(size)).longValue() != 0) {
                break;
            }
            size2 = size - 1;
        }
        return arrayList.subList(0, i);
    }

    public boolean j0(long j, long j2) {
        if (j == 0 || j2 <= 0) {
            return true;
        }
        ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).B.getClass();
        return Math.abs(System.currentTimeMillis() - j) > j2;
    }

    public long k0(byte[] bArr) {
        c21.uShadow.g(bArr);
        o1 o1Var = (o1) ((androidx.compose.foundation.lazy.layout.s0) this).s;
        t4 t4Var = o1Var.z;
        o1.k(t4Var);
        t4Var.z();
        MessageDigest Q = t4.Q();
        if (Q != null) {
            return t4.R(Q.digest(bArr));
        }
        s0 s0Var = o1Var.w;
        o1.m(s0Var);
        s0Var.x.a("Failed to get MD5");
        return 0L;
    }

    public byte[] l0(byte[] bArr) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            gZIPOutputStream.write(bArr);
            gZIPOutputStream.close();
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            s0 s0Var = ((o1) ((androidx.compose.foundation.lazy.layout.s0) this).s).w;
            o1.m(s0Var);
            s0Var.x.b(e, "Failed to gzip content");
            throw e;
        }
    }
}
