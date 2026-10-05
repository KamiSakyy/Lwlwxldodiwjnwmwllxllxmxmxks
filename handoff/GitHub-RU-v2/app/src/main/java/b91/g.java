package b91;

import a5.y;
import aa.b0;
import aa.c0;
import aa.r0;
import aa.s0;
import aa.w;
import aa.z;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Build;
import android.text.Spanned;
import android.view.MotionEvent;
import android.widget.EdgeEffect;
import android.widget.RemoteViews;
import android.widget.TextView;
import androidx.compose.runtime.l2;
import androidx.compose.runtime.m2;
import androidx.compose.runtime.r2;
import androidx.compose.runtime.v2;
import ar0.i1;
import ar0.m0;
import ar0.n0;
import b6.e0;
import com.apollographql.apollo.exception.ApolloException;
import com.github.service.models.response.CheckStatusState;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.issueorpullrequest.CloseReason;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.shortcuts.ShortcutType;
import com.github.service.models.response.type.CommentAuthorAssociation;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.PullRequestReviewEvent;
import com.github.service.models.response.type.StatusState;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.gms.internal.measurement.z3;
import com.google.android.gms.internal.play_billing.w0;
import d2.a0;
import g20.t;
import g20.u;
import g20.v;
import hc0.p2;
import hc0.uu;
import java.lang.reflect.Type;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import k71.x;
import k81.c1;
import k81.f0;
import k81.j1;
import k81.k1;
import k81.r1;
import k81.u0;
import kc0.g5;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import m10.ia;
import m10.y70;
import m10.ya0;
import oj0.b2;
import oj0.c2;
import oj0.d2;
import oj0.e2;
import oj0.f1;
import oj0.g0;
import oj0.h0;
import oj0.i0;
import oj0.j0;
import oj0.o0;
import oj0.p0;
import oj0.u3;
import oj0.v3;
import pz0.qt;
import pz0.va;
import sy.d0;
import t71.p;
import uu0.c5;
import uu0.d5;
import uu0.e5;
import uu0.f5;
import uu0.h5;
import uu0.i5;
import uu0.j5;
import uu0.s5;
import uu0.v5;
import v8.l0;
import w61.q;
import x61.r;
import x61.s;
import y41.t1;
import yz0.b8;
import yz0.d3;
import yz0.m1;
import yz0.y1;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class g {
    public static int A(int i, Rect rect, Rect rect2) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else {
            if (i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            i2 = rect2.top;
            i3 = rect.bottom;
        }
        return Math.max(0, i2 - i3);
    }

    public static int B(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return Math.abs(((rect.width() / 2) + rect.left) - ((rect2.width() / 2) + rect2.left));
        }
        return Math.abs(((rect.height() / 2) + rect.top) - ((rect2.height() / 2) + rect2.top));
    }

    public static final KSerializer C(b21.l lVar, k71.e eVar) {
        k71.k.g(lVar, "module");
        KSerializer a = lVar.a(eVar, r.r);
        return a == null ? new g81.b(eVar) : a;
    }

    public static float D(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f5.c.c(edgeEffect, f, f2);
        }
        f5.b.a(edgeEffect, f, f2);
        return f;
    }

    public static final KSerializer E(r71.b bVar, ArrayList arrayList, j71.a aVar) {
        KSerializer dVar;
        KSerializer k1Var;
        k71.k.g(bVar, "<this>");
        if (bVar.equals(x.a(Collection.class)) || bVar.equals(x.a(List.class)) || bVar.equals(x.a(List.class)) || bVar.equals(x.a(ArrayList.class))) {
            dVar = new k81.d((KSerializer) arrayList.get(0), 0);
        } else if (bVar.equals(x.a(HashSet.class))) {
            dVar = new k81.d((KSerializer) arrayList.get(0), 1);
        } else if (bVar.equals(x.a(Set.class)) || bVar.equals(x.a(Set.class)) || bVar.equals(x.a(LinkedHashSet.class))) {
            dVar = new k81.d((KSerializer) arrayList.get(0), 2);
        } else if (bVar.equals(x.a(HashMap.class))) {
            dVar = new f0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 0);
        } else if (bVar.equals(x.a(Map.class)) || bVar.equals(x.a(Map.class)) || bVar.equals(x.a(LinkedHashMap.class))) {
            dVar = new f0((KSerializer) arrayList.get(0), (KSerializer) arrayList.get(1), 1);
        } else {
            if (bVar.equals(x.a(Map.Entry.class))) {
                KSerializer kSerializer = (KSerializer) arrayList.get(0);
                KSerializer kSerializer2 = (KSerializer) arrayList.get(1);
                k71.k.g(kSerializer, "keySerializer");
                k71.k.g(kSerializer2, "valueSerializer");
                k1Var = new u0(kSerializer, kSerializer2, 0);
            } else if (bVar.equals(x.a(w61.k.class))) {
                KSerializer kSerializer3 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer4 = (KSerializer) arrayList.get(1);
                k71.k.g(kSerializer3, "keySerializer");
                k71.k.g(kSerializer4, "valueSerializer");
                k1Var = new u0(kSerializer3, kSerializer4, 1);
            } else if (bVar.equals(x.a(q.class))) {
                KSerializer kSerializer5 = (KSerializer) arrayList.get(0);
                KSerializer kSerializer6 = (KSerializer) arrayList.get(1);
                KSerializer kSerializer7 = (KSerializer) arrayList.get(2);
                k71.k.g(kSerializer5, "aSerializer");
                k71.k.g(kSerializer6, "bSerializer");
                k71.k.g(kSerializer7, "cSerializer");
                dVar = new r1(kSerializer5, kSerializer6, kSerializer7);
            } else if (l0.x(bVar).isArray()) {
                Object a = aVar.a();
                k71.k.e(a, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
                KSerializer kSerializer8 = (KSerializer) arrayList.get(0);
                k71.k.g(kSerializer8, "elementSerializer");
                k1Var = new k1((r71.b) a, kSerializer8);
            } else {
                dVar = null;
            }
            dVar = k1Var;
        }
        if (dVar != null) {
            return dVar;
        }
        KSerializer[] kSerializerArr = (KSerializer[]) arrayList.toArray(new KSerializer[0]);
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        k71.k.g(kSerializerArr2, "args");
        return c1.d(l0.x(bVar), (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
    }

    /* JADX WARN: Removed duplicated region for block: B:78:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static aa.f F(ea.e eVar, s0 s0Var, UUID uuid, w wVar, Set set) {
        UUID uuid2;
        ea.e eVar2;
        w wVar2 = wVar;
        k71.k.g(s0Var, "operation");
        eVar.j();
        r0 r0Var = null;
        r rVar = null;
        s sVar = null;
        while (eVar.hasNext()) {
            String c0 = eVar.c0();
            int hashCode = c0.hashCode();
            if (hashCode != -1809421292) {
                if (hashCode == -1294635157) {
                    eVar2 = eVar;
                    if (c0.equals("errors")) {
                        if (eVar2.peek() == ea.d.A) {
                            eVar2.g0();
                            rVar = r.r;
                        } else {
                            eVar2.n();
                            rVar = new ArrayList();
                            while (eVar2.hasNext()) {
                                eVar2.j();
                                String str = "";
                                ArrayList arrayList = null;
                                ArrayList arrayList2 = null;
                                Map map = null;
                                LinkedHashMap linkedHashMap = null;
                                while (eVar2.hasNext()) {
                                    String c02 = eVar2.c0();
                                    switch (c02.hashCode()) {
                                        case -1809421292:
                                            if (c02.equals("extensions")) {
                                                Object Q = m71.a.Q(eVar2);
                                                map = Q instanceof Map ? (Map) Q : null;
                                                break;
                                            }
                                            LinkedHashMap linkedHashMap2 = linkedHashMap == null ? new LinkedHashMap() : linkedHashMap;
                                            linkedHashMap2.put(c02, m71.a.Q(eVar2));
                                            linkedHashMap = linkedHashMap2;
                                        case -1197189282:
                                            if (c02.equals("locations")) {
                                                if (eVar2.peek() == ea.d.A) {
                                                    eVar2.g0();
                                                    arrayList = null;
                                                } else {
                                                    ArrayList arrayList3 = new ArrayList();
                                                    eVar2.n();
                                                    while (eVar2.hasNext()) {
                                                        eVar2.j();
                                                        int i = -1;
                                                        int i2 = -1;
                                                        while (eVar2.hasNext()) {
                                                            String c03 = eVar2.c0();
                                                            if (k71.k.b(c03, "line")) {
                                                                i = eVar2.nextInt();
                                                            } else if (k71.k.b(c03, "column")) {
                                                                i2 = eVar2.nextInt();
                                                            } else {
                                                                eVar2.B();
                                                            }
                                                        }
                                                        eVar2.e();
                                                        arrayList3.add(new y(i, i2, 1));
                                                    }
                                                    eVar2.k();
                                                    arrayList = arrayList3;
                                                }
                                                break;
                                            }
                                            if (linkedHashMap == null) {
                                            }
                                            linkedHashMap2.put(c02, m71.a.Q(eVar2));
                                            linkedHashMap = linkedHashMap2;
                                            break;
                                        case 3433509:
                                            if (c02.equals("path")) {
                                                if (eVar2.peek() == ea.d.A) {
                                                    eVar2.g0();
                                                    arrayList2 = null;
                                                    break;
                                                } else {
                                                    ArrayList arrayList4 = new ArrayList();
                                                    eVar2.n();
                                                    while (eVar2.hasNext()) {
                                                        int ordinal = eVar2.peek().ordinal();
                                                        if (ordinal == 6 || ordinal == 7) {
                                                            arrayList4.add(Integer.valueOf(eVar2.nextInt()));
                                                        } else {
                                                            String u = eVar2.u();
                                                            k71.k.d(u);
                                                            arrayList4.add(u);
                                                        }
                                                    }
                                                    eVar2.k();
                                                    arrayList2 = arrayList4;
                                                    break;
                                                }
                                            } else {
                                                if (linkedHashMap == null) {
                                                }
                                                linkedHashMap2.put(c02, m71.a.Q(eVar2));
                                                linkedHashMap = linkedHashMap2;
                                                break;
                                            }
                                        case 954925063:
                                            if (c02.equals("message")) {
                                                String u2 = eVar2.u();
                                                if (u2 == null) {
                                                    str = "";
                                                    break;
                                                } else {
                                                    str = u2;
                                                    break;
                                                }
                                            } else {
                                                if (linkedHashMap == null) {
                                                }
                                                linkedHashMap2.put(c02, m71.a.Q(eVar2));
                                                linkedHashMap = linkedHashMap2;
                                                break;
                                            }
                                        default:
                                            if (linkedHashMap == null) {
                                            }
                                            linkedHashMap2.put(c02, m71.a.Q(eVar2));
                                            linkedHashMap = linkedHashMap2;
                                            break;
                                    }
                                }
                                eVar2.e();
                                rVar.add(new b0(str, arrayList, arrayList2, map, linkedHashMap));
                            }
                            eVar2.k();
                        }
                        wVar2 = wVar;
                    }
                } else if (hashCode == 3076010 && c0.equals("data")) {
                    Map map2 = (Map) t1.T(s0Var, wVar2).s;
                    LinkedHashMap linkedHashMap3 = new LinkedHashMap();
                    for (Map.Entry entry : map2.entrySet()) {
                        if (k71.k.b(entry.getValue(), Boolean.FALSE)) {
                            linkedHashMap3.put(entry.getKey(), entry.getValue());
                        }
                    }
                    Set keySet = linkedHashMap3.keySet();
                    LinkedHashMap linkedHashMap4 = new LinkedHashMap();
                    linkedHashMap4.putAll(wVar2.c);
                    r0Var = (r0) ((c0) aa.c.b(s0Var.g()).a(eVar, new w(linkedHashMap4, keySet, set)));
                } else {
                    eVar2 = eVar;
                }
                eVar2.B();
                wVar2 = wVar;
            } else {
                eVar2 = eVar;
                if (c0.equals("extensions")) {
                    Object Q2 = m71.a.Q(eVar2);
                    sVar = Q2 instanceof Map ? (Map) Q2 : null;
                    wVar2 = wVar;
                }
                eVar2.B();
                wVar2 = wVar;
            }
        }
        eVar.e();
        if (uuid == null) {
            UUID randomUUID = UUID.randomUUID();
            k71.k.f(randomUUID, "randomUUID(...)");
            uuid2 = randomUUID;
        } else {
            uuid2 = uuid;
        }
        if (sVar == null) {
            sVar = s.r;
        }
        return new aa.f(uuid2, s0Var, r0Var, rVar, (ApolloException) null, sVar, z.a, false);
    }

    public static long G(String str, int i) {
        int m = m(str, 0, i, false);
        Matcher matcher = q81.j.n.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (m < i) {
            int m2 = m(str, m + 1, i, true);
            matcher.region(m, m2);
            if (i3 == -1 && matcher.usePattern(q81.j.n).matches()) {
                String group = matcher.group(1);
                k71.k.f(group, "group(...)");
                i3 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                k71.k.f(group2, "group(...)");
                i6 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                k71.k.f(group3, "group(...)");
                i7 = Integer.parseInt(group3);
            } else if (i4 == -1 && matcher.usePattern(q81.j.m).matches()) {
                String group4 = matcher.group(1);
                k71.k.f(group4, "group(...)");
                i4 = Integer.parseInt(group4);
            } else {
                if (i5 == -1) {
                    Pattern pattern = q81.j.l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        k71.k.f(group5, "group(...)");
                        Locale locale = Locale.US;
                        k71.k.f(locale, "US");
                        String lowerCase = group5.toLowerCase(locale);
                        k71.k.f(lowerCase, "toLowerCase(...)");
                        String pattern2 = pattern.pattern();
                        k71.k.f(pattern2, "pattern(...)");
                        i5 = p.R(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(q81.j.k).matches()) {
                    String group6 = matcher.group(1);
                    k71.k.f(group6, "group(...)");
                    i2 = Integer.parseInt(group6);
                }
            }
            m = m(str, m2 + 1, i, false);
        }
        if (70 <= i2 && i2 < 100) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 < 70) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i5 == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (1 > i4 || i4 >= 32) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i3 < 0 || i3 >= 24) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i6 < 0 || i6 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (i7 < 0 || i7 >= 60) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(r81.g.a);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    public static final void H(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            t2.a.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            k71.k.g(fArr8, "<this>");
            k71.k.g(fArr7, "destination");
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float o = o(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * o);
                }
            }
            float sqrt = (float) Math.sqrt(o(fArr7, fArr7));
            if (sqrt < 1.0E-6f) {
                sqrt = 1.0E-6f;
            }
            float f = 1.0f / sqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : o(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float o2 = o(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    o2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = o2 / fArr11[i14];
        }
    }

    public static final KSerializer I(b21.l lVar, Type type) {
        k71.k.g(lVar, "<this>");
        k71.k.g(type, "type");
        KSerializer H = z3.H(lVar, type, true);
        if (H != null) {
            return H;
        }
        Class E = z3.E(type);
        k71.k.g(E, "<this>");
        throw new SerializationException(c1.k(x.a(E)));
    }

    public static final KSerializer J(r71.b bVar) {
        k71.k.g(bVar, "<this>");
        KSerializer L = L(bVar);
        if (L != null) {
            return L;
        }
        throw new SerializationException(c1.k(bVar));
    }

    public static final KSerializer K(b21.l lVar, r71.f fVar) {
        k71.k.g(lVar, "<this>");
        k71.k.g(fVar, "type");
        return b4.f0(lVar, fVar, false);
    }

    public static final KSerializer L(r71.b bVar) {
        k71.k.g(bVar, "<this>");
        KSerializer d = c1.d(l0.x(bVar), (KSerializer[]) Arrays.copyOf(new KSerializer[0], 0));
        if (d != null) {
            return d;
        }
        y61.e eVar = j1.a;
        return (KSerializer) j1.a.get(bVar);
    }

    public static final ArrayList M(b21.l lVar, List list, boolean z) {
        k71.k.g(lVar, "<this>");
        k71.k.g(list, "typeArguments");
        if (!z) {
            ArrayList arrayList = new ArrayList(x61.n.F(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                KSerializer K = K(lVar, (r71.f) it.next());
                if (K == null) {
                    return null;
                }
                arrayList.add(K);
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(x61.n.F(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            r71.f fVar = (r71.f) it2.next();
            k71.k.g(fVar, "type");
            KSerializer f0 = b4.f0(lVar, fVar, true);
            if (f0 == null) {
                throw new SerializationException(c1.k(c1.j(fVar)));
            }
            arrayList2.add(f0);
        }
        return arrayList2;
    }

    public static void N(TextView textView, CharSequence charSequence) {
        CharSequence text = textView.getText();
        if (charSequence != text) {
            if (charSequence == null && text.length() == 0) {
                return;
            }
            if (!(charSequence instanceof Spanned)) {
                if ((charSequence == null) == (text == null)) {
                    if (charSequence == null) {
                        return;
                    }
                    int length = charSequence.length();
                    if (length == text.length()) {
                        for (int i = 0; i < length; i++) {
                            if (charSequence.charAt(i) == text.charAt(i)) {
                            }
                        }
                        return;
                    }
                }
            } else if (charSequence.equals(text)) {
                return;
            }
            textView.setText(charSequence);
        }
    }

    public static final boolean O(List list, Map map) {
        boolean booleanValue;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                return false;
            }
            aa.l lVar = (aa.l) it.next();
            Object obj = map.get(lVar.a);
            Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
            booleanValue = bool != null ? bool.booleanValue() : false;
            if (lVar.b) {
                booleanValue = !booleanValue;
            }
        } while (booleanValue);
        return true;
    }

    public static final mn.m P(v vVar) {
        g20.s sVar = vVar.p;
        t tVar = vVar.q;
        g20.j jVar = vVar.r;
        g20.i iVar = vVar.o;
        u uVar = vVar.s;
        int i = uVar != null ? uVar.a : 0;
        int i2 = iVar != null ? iVar.a : 0;
        int i3 = jVar != null ? jVar.a : 0;
        int i4 = tVar != null ? tVar.a : 0;
        int i5 = sVar != null ? sVar.a : 0;
        g20.g gVar = vVar.n;
        return new mn.m(uVar != null ? uVar.a : 0, iVar != null ? iVar.a : 0, jVar != null ? jVar.a : 0, tVar != null ? tVar.a : 0, sVar != null ? sVar.a : 0, Math.max((((((gVar != null ? gVar.a : 0) - i5) - i4) - i3) - i2) - i, 0));
    }

    public static final s5.e Q(String str) {
        k71.k.g(str, "name");
        return new s5.e(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object R(int i, Object obj, k3.z zVar, k3.s sVar, int i2) {
        Object[] objArr;
        Object[] objArr2;
        if (!(obj instanceof Typeface)) {
            return obj;
        }
        boolean z = false;
        int i3 = 0;
        z = false;
        if ((i & 1) != 0 && !k71.k.b(zVar.b, sVar)) {
            k3.s sVar2 = k3.s.u;
            if (sVar.a(sVar2) >= 0 && k71.k.h(zVar.b.r, sVar2.r) < 0) {
                objArr = true;
                objArr2 = (i & 2) == 0 && i2 != zVar.c;
                if (objArr2 == true && objArr != true) {
                    return obj;
                }
                if (Build.VERSION.SDK_INT < 28) {
                    int i4 = objArr != false ? sVar.r : zVar.b.r;
                    if (objArr2 == false ? zVar.c == 1 : i2 == 1) {
                        z = true;
                    }
                    return a5.l.b((Typeface) obj, i4, z);
                }
                Object[] objArr3 = objArr2 == true && i2 == 1;
                if (objArr3 == true && objArr == true) {
                    i3 = 3;
                } else if (objArr == true) {
                    i3 = 1;
                } else if (objArr3 != false) {
                    i3 = 2;
                }
                return Typeface.create((Typeface) obj, i3);
            }
        }
        objArr = false;
        if ((i & 2) == 0) {
        }
        if (objArr2 == true) {
        }
        if (Build.VERSION.SDK_INT < 28) {
        }
    }

    public static final y70 S(ShortcutType shortcutType) {
        int i = shortcutType == null ? -1 : dz.p.a[shortcutType.ordinal()];
        if (i == -1) {
            return y70.x;
        }
        if (i == 1) {
            return y70.u;
        }
        if (i == 2) {
            return y70.v;
        }
        if (i == 3) {
            return y70.t;
        }
        if (i == 4) {
            return y70.w;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final qt T(PullRequestReviewEvent pullRequestReviewEvent) {
        k71.k.g(pullRequestReviewEvent, "<this>");
        int i = jx0.i.a[pullRequestReviewEvent.ordinal()];
        if (i == 1) {
            return qt.w;
        }
        if (i == 2) {
            return qt.t;
        }
        if (i == 3) {
            return qt.s;
        }
        if (i == 4) {
            return qt.v;
        }
        if (i == 5) {
            return qt.u;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final CheckStatusState U(uu uuVar) {
        int ordinal = uuVar.ordinal();
        if (ordinal == 0) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 1) {
            return CheckStatusState.UNKNOWN__;
        }
        if (ordinal == 2) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 3) {
            return CheckStatusState.QUEUED;
        }
        if (ordinal == 4) {
            return CheckStatusState.COMPLETED;
        }
        if (ordinal == 5) {
            return CheckStatusState.UNKNOWN__;
        }
        throw new NoWhenBranchMatchedException();
    }

    public static final p01.g V(j0 j0Var) {
        StatusState statusState;
        g0 g0Var;
        h0 h0Var;
        g0 g0Var2;
        String str = j0Var.b;
        boolean z = j0Var.c;
        i0 i0Var = j0Var.d;
        String str2 = (i0Var == null || (g0Var2 = i0Var.c) == null) ? null : g0Var2.a;
        if (i0Var == null || (g0Var = i0Var.c) == null || (h0Var = g0Var.b) == null || (statusState = sy.q.o(h0Var.a)) == null) {
            statusState = StatusState.UNKNOWN__;
        }
        return new p01.g(str, z, str2, statusState);
    }

    public static final y1 W(ct.u uVar) {
        ya0 ya0Var;
        String str;
        int i;
        SubscriptionState subscriptionState;
        ArrayList arrayList;
        SubscriptionState subscriptionState2;
        k71.k.g(uVar, "<this>");
        ct.m mVar = uVar.m;
        ya0 ya0Var2 = uVar.k;
        ct.t tVar = uVar.j;
        ya0 ya0Var3 = tVar.d;
        String str2 = uVar.b;
        String str3 = uVar.c;
        String str4 = uVar.d;
        Boolean bool = uVar.g;
        boolean z = true;
        if (bool == null || bool.booleanValue()) {
            z = false;
        }
        int i2 = uVar.h.a;
        boolean z2 = false;
        ZonedDateTime zonedDateTime = uVar.f;
        d3 d3Var = new d3(tVar.f.b, tVar.b);
        SubscriptionState y0 = i4.y0(ya0Var3);
        SubscriptionState y02 = i4.y0(ya0Var2);
        List list = tVar.e;
        SubscriptionState subscriptionState3 = SubscriptionState.IGNORED;
        if (y02 == subscriptionState3 || y0 == subscriptionState3 || (y0 == null && y02 == null)) {
            ya0Var = ya0Var2;
        } else {
            SubscriptionState subscriptionState4 = SubscriptionState.UNSUBSCRIBED;
            if (y0 == subscriptionState4 && y02 == subscriptionState4) {
                ya0Var = ya0Var2;
            } else {
                ya0Var = ya0Var2;
                SubscriptionState subscriptionState5 = SubscriptionState.CUSTOM;
                if (y0 != subscriptionState5 || y02 != subscriptionState4) {
                    if (y0 != subscriptionState5 || y02 != subscriptionState5) {
                        z2 = true;
                    } else if (list != null) {
                        z2 = list.contains(ia.u);
                    }
                }
            }
            z2 = false;
        }
        SubscriptionState y03 = i4.y0(ya0Var3);
        SubscriptionState y04 = i4.y0(ya0Var);
        SubscriptionState subscriptionState6 = (y04 == subscriptionState3 || y03 == SubscriptionState.SUBSCRIBED || y04 == (subscriptionState2 = SubscriptionState.UNSUBSCRIBED)) ? subscriptionState3 : subscriptionState2;
        SubscriptionState y05 = i4.y0(ya0Var3);
        SubscriptionState y06 = i4.y0(ya0Var);
        SubscriptionState subscriptionState7 = SubscriptionState.SUBSCRIBED;
        if (y05 == subscriptionState7 && y06 == null) {
            subscriptionState7 = null;
        }
        List P = i4.P(uVar.r);
        String str5 = uVar.l;
        int i3 = uVar.e;
        IssueState O = i21.a.O(uVar.i);
        List list2 = mVar.b;
        if (list2 != null) {
            ArrayList S = x61.m.S(list2);
            str = str5;
            i = i3;
            arrayList = new ArrayList(x61.n.F(S, 10));
            subscriptionState = subscriptionState7;
            int i4 = 0;
            for (int size = S.size(); i4 < size; size = size) {
                Object obj = S.get(i4);
                i4++;
                arrayList.add(l0.e(((ct.q) obj).b));
            }
        } else {
            str = str5;
            i = i3;
            subscriptionState = subscriptionState7;
            arrayList = r.r;
        }
        com.github.rudroid.common.b0 b0Var = new com.github.rudroid.common.b0(mVar.a, arrayList);
        ct.n nVar = uVar.n;
        int i5 = nVar != null ? nVar.a : 0;
        CloseReason w = sy.w.w(uVar.o);
        ct.p pVar = uVar.p;
        IssueType f = pVar != null ? z3.f(pVar.c) : null;
        h01.p e = sy.u.e(uVar.s);
        ct.s sVar = uVar.q;
        return new y1(str2, str3, str4, z, zonedDateTime, d3Var, z2, subscriptionState6, subscriptionState, P, str, i, b0Var, i2, O, i5, w, f, e, sVar != null ? sVar.a : null, tVar.c, sy.c.j(uVar.t));
    }

    public static final p01.n X(w61.k kVar) {
        int i;
        Object obj = kVar.r;
        e2 e2Var = (e2) obj;
        String str = e2Var.c;
        b2 b2Var = e2Var.h;
        com.github.service.models.response.a aVar = new com.github.service.models.response.a(b2Var.c, b41.b.O(b2Var.d), (String) null, false, (String) null, 60);
        boolean z = e2Var.f;
        String str2 = e2Var.d;
        try {
            d2 d2Var = ((e2) obj).i;
            i = Color.parseColor(d2Var != null ? d2Var.a : null);
        } catch (Exception unused) {
            i = -16777216;
        }
        int i2 = i;
        d2 d2Var2 = e2Var.i;
        String str3 = d2Var2 != null ? d2Var2.b : null;
        String str4 = e2Var.b;
        int i3 = e2Var.r.c;
        wl0.j jVar = new wl0.j((oj0.h) kVar.s);
        boolean z2 = e2Var.r.d;
        String str5 = (e2Var.j || e2Var.l) ? e2Var.k : null;
        String str6 = e2Var.e;
        boolean z3 = e2Var.o;
        c2 c2Var = e2Var.p;
        return new p01.n(str, aVar, z, str2, i2, str3, str4, i3, jVar, z2, str5, str6, z3, c2Var != null ? f1.e.h(c2Var.b.b, "/", c2Var.a) : null);
    }

    public static final CheckStatusState Y(p2 p2Var) {
        k71.k.g(p2Var, "<this>");
        switch (p2Var.ordinal()) {
            case 0:
                return CheckStatusState.COMPLETED;
            case 1:
                return CheckStatusState.IN_PROGRESS;
            case 2:
                return CheckStatusState.UNKNOWN__;
            case 3:
                return CheckStatusState.QUEUED;
            case 4:
                return CheckStatusState.REQUESTED;
            case 5:
                return CheckStatusState.WAITING;
            case 6:
                return CheckStatusState.UNKNOWN__;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static final SimpleRepository Z(v3 v3Var) {
        k71.k.g(v3Var, "<this>");
        String str = v3Var.a;
        String str2 = v3Var.b;
        u3 u3Var = v3Var.d;
        return new SimpleRepository(b41.b.O(u3Var.d), str, str2, u3Var.c, v3Var.c);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p01.g a(f1 f1Var) {
        String str;
        j0 j0Var;
        String str2;
        i0 i0Var;
        g0 g0Var;
        StatusState o;
        i0 i0Var2;
        g0 g0Var2;
        h0 h0Var;
        i0 i0Var3;
        g0 g0Var3;
        h0 h0Var2;
        g0 g0Var4;
        p0 p0Var = f1Var.e;
        o0 o0Var = f1Var.f;
        if (p0Var != null) {
            j0Var = p0Var.c;
        } else {
            if (o0Var == null) {
                str = "main";
                str2 = null;
                boolean b = k71.k.b(p0Var == null ? Boolean.valueOf(p0Var.c.c) : o0Var != null ? Boolean.valueOf(o0Var.c.c) : null, Boolean.TRUE);
                if (p0Var != null) {
                    i0 i0Var4 = p0Var.c.d;
                    String str3 = (i0Var4 == null || (g0Var4 = i0Var4.c) == null) ? null : g0Var4.a;
                    if (str3 != null) {
                        str2 = str3;
                        if (p0Var != null || (i0Var3 = p0Var.c.d) == null || (g0Var3 = i0Var3.c) == null || (h0Var2 = g0Var3.b) == null || (o = sy.q.o(h0Var2.a)) == null) {
                            o = (o0Var != null || (i0Var2 = o0Var.c.d) == null || (g0Var2 = i0Var2.c) == null || (h0Var = g0Var2.b) == null) ? StatusState.UNKNOWN__ : sy.q.o(h0Var.a);
                        }
                        return new p01.g(str, b, str2, o);
                    }
                }
                if (o0Var != null && (i0Var = o0Var.c.d) != null && (g0Var = i0Var.c) != null) {
                    str2 = g0Var.a;
                }
                if (p0Var != null) {
                }
                if (o0Var != null) {
                }
                return new p01.g(str, b, str2, o);
            }
            j0Var = o0Var.c;
        }
        str = j0Var.b;
        str2 = null;
        boolean b2 = k71.k.b(p0Var == null ? Boolean.valueOf(p0Var.c.c) : o0Var != null ? Boolean.valueOf(o0Var.c.c) : null, Boolean.TRUE);
        if (p0Var != null) {
        }
        if (o0Var != null) {
            str2 = g0Var.a;
        }
        if (p0Var != null) {
        }
        if (o0Var != null) {
        }
        return new p01.g(str, b2, str2, o);
    }

    public static final ArrayList a0(r2 r2Var, int i, Integer num) {
        androidx.compose.runtime.tooling.i iVar = new androidx.compose.runtime.tooling.i(r2Var);
        int q = r2Var.q(i);
        Integer a = r2Var.a(i);
        while (i >= 0) {
            iVar.w(r2Var.i(i), r2Var.k(i) ? r2Var.p(r2Var.b, i) : androidx.compose.runtime.n.a, r2Var.a.g(i), num);
            if (q >= 0) {
                Integer num2 = a;
                a = r2Var.a(q);
                i = q;
                q = r2Var.q(q);
                num = num2;
            } else {
                i = q;
                num = a;
            }
        }
        return (ArrayList) ((androidx.compose.foundation.lazy.layout.s0) iVar).s;
    }

    public static final void b(kk.a aVar, q2.u uVar, long j) {
        com.google.android.gms.measurement.internal.m mVar = (com.google.android.gms.measurement.internal.m) aVar.s;
        mVar.getClass();
        r2.c cVar = (r2.c) mVar.c;
        r2.c cVar2 = (r2.c) mVar.a;
        boolean b = q2.t.b(uVar);
        long j2 = uVar.b;
        if (b) {
            x61.l.J(cVar2.d, (a81.t) null);
            cVar2.e = 0;
            x61.l.J(cVar.d, (a81.t) null);
            cVar.e = 0;
            mVar.b = 0L;
        }
        if (!q2.t.d(uVar)) {
            r rVar = uVar.k;
            if (rVar == null) {
                rVar = r.r;
            }
            int i = 0;
            for (int size = rVar.size(); i < size; size = size) {
                q2.b bVar = (q2.b) rVar.get(i);
                mVar.a(bVar.a, c2.b.f(bVar.c, j));
                i++;
            }
            mVar.a(j2, c2.b.f(uVar.l, j));
        }
        if (q2.t.d(uVar) && j2 - mVar.b > 40) {
            x61.l.J(cVar2.d, (a81.t) null);
            cVar2.e = 0;
            x61.l.J(cVar.d, (a81.t) null);
            cVar.e = 0;
            mVar.b = 0L;
        }
        mVar.b = j2;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.List] */
    public static final int b0(boolean z, n0.p pVar, int i) {
        return z ? ((n0.q) pVar.m.get(i)).u : ((n0.q) pVar.m.get(i)).v;
    }

    public static final yz0.p c(g5 g5Var) {
        k71.k.g(g5Var, "<this>");
        double d = g5Var.e;
        ArrayList arrayList = g5Var.d;
        ArrayList arrayList2 = new ArrayList(x61.n.F(arrayList, 10));
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            int i3 = i + 1;
            if (i < 0) {
                d0.x();
                throw null;
            }
            wz0.e c = wz0.d.c((String) obj, 2);
            arrayList2.add(new m1(c.b, c.a, g5Var.a + i));
            i = i3;
        }
        return new yz0.p(d, g5Var.a, g5Var.b, g5Var.c, arrayList2);
    }

    public static final b01.b d(ar0.p0 p0Var) {
        Enum r22;
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        int i2;
        ZonedDateTime zonedDateTime;
        String str;
        com.github.service.models.response.a aVar;
        b01.c cVar;
        b8 b8Var;
        List list;
        int i3;
        String str2;
        b01.k kVar;
        boolean z4;
        String str3;
        ArrayList arrayList;
        List list2;
        int i4;
        String str4;
        Iterator it;
        String str5;
        b01.l lVar;
        b01.g h;
        er0.g gVar;
        k71.k.g(p0Var, "<this>");
        ar0.g0 g0Var = p0Var.o;
        ar0.o0 o0Var = p0Var.m;
        Enum r3 = o0Var.d;
        String str6 = p0Var.b;
        String str7 = p0Var.c;
        ar0.h0 h0Var = p0Var.q;
        com.github.service.models.response.a e = k41.b.e(h0Var != null ? h0Var.c : null);
        String str8 = o0Var.a;
        String str9 = o0Var.b;
        ar0.l0 l0Var = o0Var.c;
        String str10 = l0Var.a;
        String str11 = l0Var.b;
        boolean z5 = p0Var.h;
        int i5 = r3 == null ? -1 : nx0.a.a[r3.ordinal()];
        boolean z6 = i5 == 1 || i5 == 2 || i5 == 3 || i5 == 4;
        boolean z7 = p0Var.i;
        if (r3 == null) {
            r22 = r3;
            i = -1;
        } else {
            r22 = r3;
            i = nx0.a.a[r3.ordinal()];
        }
        if (i == 1 || i == 2 || i == 3) {
            z = z6;
            z2 = z7;
            z3 = true;
        } else {
            z = z6;
            z2 = z7;
            z3 = false;
        }
        boolean z8 = (r22 == null ? -1 : nx0.a.a[r22.ordinal()]) == 1;
        b01.e e2 = y9.a.e(p0Var.p.c);
        ZonedDateTime zonedDateTime2 = p0Var.d;
        ZonedDateTime zonedDateTime3 = p0Var.e;
        boolean z9 = g0Var != null;
        ZonedDateTime zonedDateTime4 = p0Var.f;
        int i6 = p0Var.g;
        if (g0Var != null) {
            i2 = i6;
            zonedDateTime = zonedDateTime2;
            String str12 = g0Var.b;
            str = str7;
            er0.i iVar = g0Var.d;
            aVar = e;
            yp0.c cVar2 = iVar.j;
            String str13 = iVar.c;
            gu0.c cVar3 = iVar.n;
            at0.a aVar2 = iVar.l;
            boolean z10 = iVar.d;
            boolean z11 = iVar.e;
            boolean z12 = iVar.f;
            boolean z13 = iVar.g;
            er0.h hVar = iVar.i;
            String str14 = (hVar == null || (gVar = hVar.c) == null) ? null : gVar.b;
            i1 i1Var = iVar.m;
            gt0.a aVar3 = iVar.k;
            h = aa1.b.h(cVar2, str13, cVar3, (r32 & 4) != 0 ? null : aVar2, null, z10, z11, z12, (r32 & 128) != 0 ? false : z13, (r32 & 256) != 0 ? null : str14, false, r.r, i1Var, (r32 & 4096) != 0 ? false : aVar3.b, (r32 & 8192) != 0 ? false : aVar3.c, aa1.b.c0(iVar));
            n0 n0Var = g0Var.c;
            cVar = new b01.c(str12, h, n0Var != null ? n0Var.a : null);
        } else {
            i2 = i6;
            zonedDateTime = zonedDateTime2;
            str = str7;
            aVar = e;
            cVar = null;
        }
        String str15 = p0Var.l;
        int i7 = p0Var.r.a;
        i1 i1Var2 = p0Var.u;
        b01.c cVar4 = cVar;
        b8 b8Var2 = new b8(i1Var2.d, str6, p0Var.j, i1Var2.c);
        List f = f(p0Var.t);
        m0 m0Var = p0Var.s;
        if (m0Var != null) {
            gr0.i iVar2 = m0Var.c;
            String str16 = iVar2.a;
            b8Var = b8Var2;
            String str17 = iVar2.b;
            boolean z14 = iVar2.c;
            int i8 = iVar2.d;
            boolean z15 = iVar2.e;
            gr0.h hVar2 = iVar2.f;
            if (hVar2 == null || (list2 = hVar2.a) == null) {
                z4 = z15;
                list = f;
                i3 = i7;
                str2 = str6;
                str3 = str16;
                arrayList = r.r;
            } else {
                z4 = z15;
                arrayList = new ArrayList();
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    List list3 = f;
                    gr0.g gVar2 = (gr0.g) it2.next();
                    if (gVar2 != null) {
                        ir0.a aVar4 = gVar2.c;
                        i4 = i7;
                        str4 = str6;
                        it = it2;
                        str5 = str16;
                        lVar = new b01.l(aVar4.d, aVar4.a, aVar4.b, aVar4.c);
                    } else {
                        i4 = i7;
                        str4 = str6;
                        it = it2;
                        str5 = str16;
                        lVar = null;
                    }
                    if (lVar != null) {
                        arrayList.add(lVar);
                    }
                    it2 = it;
                    str16 = str5;
                    f = list3;
                    i7 = i4;
                    str6 = str4;
                }
                list = f;
                i3 = i7;
                str2 = str6;
                str3 = str16;
            }
            kVar = new b01.k(str3, str17, z14, i8, z4, arrayList);
        } else {
            b8Var = b8Var2;
            list = f;
            i3 = i7;
            str2 = str6;
            kVar = null;
        }
        r01.a aVar5 = CommentAuthorAssociation.Companion;
        String str18 = p0Var.k.r;
        aVar5.getClass();
        return new b01.b(str2, str, aVar, str8, str9, str10, str11, z5, z, z2, z3, z8, e2, zonedDateTime, zonedDateTime3, z9, zonedDateTime4, i2, cVar4, str15, i3, b8Var, list, kVar, r01.a.a(str18), o0Var.e, e(p0Var.v));
    }

    public static void d0(int i, Object[] objArr) {
        for (int i2 = 0; i2 < i; i2++) {
            if (objArr[i2] == null) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 9);
                sb.append("at index ");
                sb.append(i2);
                throw new NullPointerException(sb.toString());
            }
        }
    }

    public static final b01.f e(ar0.k kVar) {
        boolean z = kVar.b;
        boolean z2 = kVar.c;
        boolean z3 = kVar.d;
        ZonedDateTime zonedDateTime = kVar.e;
        va vaVar = kVar.f;
        return new b01.f(z, z2, z3, zonedDateTime, vaVar != null ? b4.n0(vaVar) : null);
    }

    public static final List f(cs0.j jVar) {
        ArrayList arrayList;
        cs0.g gVar;
        cs0.a aVar;
        List list;
        cs0.i iVar;
        cs0.b bVar;
        List list2;
        cs0.h hVar;
        cs0.c cVar;
        List list3;
        int i = 0;
        if (jVar != null && (hVar = jVar.b) != null && (cVar = hVar.b) != null && (list3 = cVar.b) != null) {
            ArrayList S = x61.m.S(list3);
            ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
            int size = S.size();
            while (i < size) {
                Object obj = S.get(i);
                i++;
                arrayList2.add(b41.b.V(((cs0.f) obj).c));
            }
            return arrayList2;
        }
        if (jVar != null && (iVar = jVar.d) != null && (bVar = iVar.b) != null && (list2 = bVar.b) != null) {
            ArrayList S2 = x61.m.S(list2);
            ArrayList arrayList3 = new ArrayList(x61.n.F(S2, 10));
            int size2 = S2.size();
            while (i < size2) {
                Object obj2 = S2.get(i);
                i++;
                arrayList3.add(b41.b.V(((cs0.e) obj2).c));
            }
            return arrayList3;
        }
        if (jVar == null || (gVar = jVar.c) == null || (aVar = gVar.b) == null || (list = aVar.b) == null) {
            arrayList = null;
        } else {
            ArrayList S3 = x61.m.S(list);
            arrayList = new ArrayList(x61.n.F(S3, 10));
            int size3 = S3.size();
            while (i < size3) {
                Object obj3 = S3.get(i);
                i++;
                arrayList.add(b41.b.V(((cs0.d) obj3).c));
            }
        }
        return arrayList == null ? r.r : arrayList;
    }

    public static final List g(v5 v5Var) {
        ArrayList arrayList;
        k71.k.g(v5Var, "<this>");
        List<s5> list = v5Var.b.b;
        ArrayList arrayList2 = r.r;
        if (list == null) {
            return arrayList2;
        }
        ArrayList arrayList3 = new ArrayList();
        for (s5 s5Var : list) {
            if (s5Var != null) {
                j5 j5Var = s5Var.c;
                c5 c5Var = j5Var.f;
                String str = j5Var.b;
                String str2 = j5Var.c;
                int i = j5Var.d;
                e5 e5Var = j5Var.i;
                IssueType k = e5Var != null ? aa1.b.k(e5Var.c) : null;
                CloseReason k0 = b4.k0(j5Var.h);
                List<f5> list2 = c5Var.b;
                if (list2 != null) {
                    arrayList = new ArrayList(x61.n.F(list2, 10));
                    for (f5 f5Var : list2) {
                        arrayList.add(k41.b.e(f5Var != null ? f5Var.c : null));
                    }
                } else {
                    arrayList = arrayList2;
                }
                com.github.rudroid.common.b0 b0Var = new com.github.rudroid.common.b0(c5Var.a, arrayList);
                d5 d5Var = j5Var.g;
                int i2 = d5Var != null ? d5Var.a : 0;
                IssueState i0 = m71.a.i0(j5Var.e);
                i5 i5Var = j5Var.j;
                String str3 = i5Var.c.b;
                String str4 = i5Var.b;
                h01.p i3 = z3.i(j5Var.l);
                h5 h5Var = j5Var.k;
                r4 = new h01.n(str, str2, i, k, k0, b0Var, i2, i0, str3, str4, i3, h5Var != null ? h5Var.a : null);
            }
            if (r4 != null) {
                arrayList3.add(r4);
            }
        }
        return arrayList3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
    
        if (r9.bottom <= r11.top) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
    
        if (r8 == 17) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
    
        if (r8 != 66) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0047, code lost:
    
        r10 = A(r8, r9, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
    
        if (r8 == 17) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == 33) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if (r8 == 66) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        if (r8 != 130) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        r8 = r11.bottom;
        r9 = r9.bottom;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0072, code lost:
    
        if (r10 >= java.lang.Math.max(1, r8 - r9)) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:?, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
    
        throw new java.lang.IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x005f, code lost:
    
        r8 = r11.right;
        r9 = r9.right;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0064, code lost:
    
        r8 = r9.top;
        r9 = r11.top;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
    
        r8 = r9.left;
        r9 = r11.left;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0032, code lost:
    
        if (r9.right <= r11.left) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0039, code lost:
    
        if (r9.top >= r11.bottom) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0040, code lost:
    
        if (r9.left >= r11.right) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(int i, Rect rect, Rect rect2, Rect rect3) {
        boolean i2 = i(i, rect, rect2);
        if (i(i, rect, rect3) || !i2) {
            return false;
        }
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
        }
        return true;
    }

    public static boolean i(int i, Rect rect, Rect rect2) {
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            return rect2.right >= rect.left && rect2.left <= rect.right;
        }
        return rect2.bottom >= rect.top && rect2.top <= rect.bottom;
    }

    public static final s5.e j(String str) {
        k71.k.g(str, "name");
        return new s5.e(str);
    }

    public static final List k(v2 v2Var, Integer num, int i, Integer num2) {
        int i2;
        int s;
        x.d0 d0Var;
        if (v2Var.w || v2Var.p() == 0) {
            return r.r;
        }
        androidx.compose.runtime.tooling.i iVar = new androidx.compose.runtime.tooling.i(v2Var);
        if (num2 != null) {
            i2 = num2.intValue();
        } else {
            i2 = v2Var.v;
            if (i2 < 0) {
                i2 = v2Var.G(v2Var.b, i);
            }
        }
        if (num == null) {
            int P = v2Var.i - v2Var.P(v2Var.b, v2Var.r(i));
            x.w wVar = v2Var.s;
            num = Integer.valueOf(P + ((wVar == null || (d0Var = (x.d0) wVar.b(i)) == null) ? 0 : d0Var.b));
        }
        int r = v2Var.r(i) * 5;
        int[] iArr = v2Var.b;
        if (r < iArr.length) {
            s = v2Var.s(i);
        } else {
            int G = i2 >= 0 ? v2Var.G(iArr, i2) : i2;
            s = v2Var.s(i2);
            int i3 = i2;
            i2 = G;
            i = i3;
        }
        while (i >= 0) {
            iVar.w(s, (v2Var.b[(v2Var.r(i) * 5) + 1] & 536870912) != 0 ? v2Var.t(i) : androidx.compose.runtime.n.a, v2Var.Q(i), num);
            num = v2Var.b(i);
            if (i2 >= 0) {
                int G2 = v2Var.G(v2Var.b, i2);
                s = v2Var.s(i2);
                int i4 = i2;
                i2 = G2;
                i = i4;
            } else {
                i = i2;
            }
        }
        return (ArrayList) ((androidx.compose.foundation.lazy.layout.s0) iVar).s;
    }

    public static final long l(int i, androidx.compose.runtime.s sVar) {
        Context context = (Context) sVar.j(w2.j0.b);
        Resources resources = (Resources) sVar.j(w2.j0.c);
        Resources.Theme theme = context.getTheme();
        ThreadLocal threadLocal = q4.l.a;
        return a0.c(resources.getColor(i, theme));
    }

    public static int m(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || ('0' <= charAt && charAt < ':') || (('a' <= charAt && charAt < '{') || (('A' <= charAt && charAt < '[') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static final boolean n(String str, String str2) {
        k71.k.g(str, "current");
        if (str.equals(str2)) {
            return true;
        }
        if (str.length() != 0) {
            int i = 0;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i < str.length()) {
                    char charAt = str.charAt(i);
                    int i4 = i3 + 1;
                    if (i3 == 0 && charAt != '(') {
                        break;
                    }
                    if (charAt == '(') {
                        i2++;
                    } else if (charAt == ')' && i2 - 1 == 0 && i3 != str.length() - 1) {
                        break;
                    }
                    i++;
                    i3 = i4;
                } else if (i2 == 0) {
                    String substring = str.substring(1, str.length() - 1);
                    k71.k.f(substring, "substring(...)");
                    return k71.k.b(p.t0(substring).toString(), str2);
                }
            }
        }
        return false;
    }

    public static final float o(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = 0.0f;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final Integer p(r2 r2Var, androidx.compose.runtime.x xVar, int i, int i2) {
        Integer p;
        int[] iArr = r2Var.b;
        while (true) {
            if (i >= i2) {
                return null;
            }
            int i3 = iArr[(i * 5) + 3] + i;
            if (r2Var.j(i) && r2Var.i(i) == 206 && k71.k.b(r2Var.p(iArr, i), androidx.compose.runtime.v.e)) {
                Object h = r2Var.h(i, 0);
                m2 m2Var = h instanceof m2 ? (m2) h : null;
                l2 l2Var = m2Var != null ? m2Var.a : null;
                androidx.compose.runtime.p pVar = l2Var instanceof androidx.compose.runtime.p ? (androidx.compose.runtime.p) l2Var : null;
                if (pVar != null && pVar.r.equals(xVar)) {
                    return Integer.valueOf(i);
                }
            }
            if (r2Var.d(i) && (p = p(r2Var, xVar, i + 1, i3)) != null) {
                return Integer.valueOf(p.intValue());
            }
            i = i3;
        }
    }

    public static final s5.e q(String str) {
        k71.k.g(str, "name");
        return new s5.e(str);
    }

    public static final String r(Collection collection) {
        k71.k.g(collection, "collection");
        if (collection.isEmpty()) {
            return " }";
        }
        return t71.q.p(x61.m.c0(collection, ",\n", "\n", "\n", 0, (j71.c) null, 56), "    ") + "},";
    }

    public static float s(EdgeEffect edgeEffect) {
        if (Build.VERSION.SDK_INT >= 31) {
            return f5.c.b(edgeEffect);
        }
        return 0.0f;
    }

    public static final int t(RemoteViews remoteViews, b6.b2 b2Var, int i, int i2, Integer num) {
        int i3;
        if (i == -1) {
            throw new IllegalArgumentException("viewStubId must not be View.NO_ID");
        }
        if (num != null) {
            i3 = num.intValue();
        } else {
            int incrementAndGet = b2Var.g.incrementAndGet();
            if (incrementAndGet >= e0.j) {
                throw new IllegalStateException("There are too many views");
            }
            i3 = incrementAndGet + e0.i;
        }
        if (i3 != -1) {
            remoteViews.setInt(i, "setInflatedId", i3);
        }
        if (i2 != 0) {
            remoteViews.setInt(i, "setLayoutResource", i2);
        }
        remoteViews.setViewVisibility(i, 0);
        return i3;
    }

    public static final s5.e u(String str) {
        k71.k.g(str, "name");
        return new s5.e(str);
    }

    public static boolean v(int i, Rect rect, Rect rect2) {
        if (i == 17) {
            int i2 = rect.right;
            int i3 = rect2.right;
            return (i2 > i3 || rect.left >= i3) && rect.left > rect2.left;
        }
        if (i == 33) {
            int i4 = rect.bottom;
            int i5 = rect2.bottom;
            return (i4 > i5 || rect.top >= i5) && rect.top > rect2.top;
        }
        if (i == 66) {
            int i6 = rect.left;
            int i7 = rect2.left;
            return (i6 < i7 || rect.right <= i7) && rect.right < rect2.right;
        }
        if (i != 130) {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        int i8 = rect.top;
        int i9 = rect2.top;
        return (i8 < i9 || rect.bottom <= i9) && rect.bottom < rect2.bottom;
    }

    public static boolean w(MotionEvent motionEvent, int i) {
        return (motionEvent.getSource() & i) == i;
    }

    public static final String x(Collection collection) {
        return t71.q.p(x61.m.c0(collection, ",", (String) null, (String) null, 0, (j71.c) null, 62), "    ") + t71.q.p(" }", "    ");
    }

    public static final String y(Collection collection) {
        return t71.q.p(x61.m.c0(collection, ",", (String) null, (String) null, 0, (j71.c) null, 62), "    ") + t71.q.p("},", "    ");
    }

    public static final s5.e z(String str) {
        k71.k.g(str, "name");
        return new s5.e(str);
    }

    public abstract com.google.android.gms.internal.play_billing.g0 c0(w0 w0Var);

    public abstract com.google.android.gms.internal.play_billing.l0 e0(w0 w0Var);

    public abstract void f0(com.google.android.gms.internal.play_billing.l0 l0Var, com.google.android.gms.internal.play_billing.l0 l0Var2);

    public abstract void g0(com.google.android.gms.internal.play_billing.l0 l0Var, Thread thread);

    public abstract boolean h0(w0 w0Var, com.google.android.gms.internal.play_billing.g0 g0Var, com.google.android.gms.internal.play_billing.g0 g0Var2);

    public abstract boolean i0(com.google.android.gms.internal.play_billing.m0 m0Var, Object obj, Object obj2);

    public abstract boolean j0(com.google.android.gms.internal.play_billing.m0 m0Var, com.google.android.gms.internal.play_billing.l0 l0Var, com.google.android.gms.internal.play_billing.l0 l0Var2);
}
