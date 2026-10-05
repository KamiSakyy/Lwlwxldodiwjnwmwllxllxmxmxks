package sy;

import android.content.res.ColorStateList;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.github.service.models.response.Avatar;
import com.github.service.models.response.IssueOrPullRequestState;
import com.github.service.models.response.SimpleLegacyProject;
import com.github.service.models.response.SimpleRepository;
import com.github.service.models.response.issueorpullrequest.IssueType;
import com.github.service.models.response.shortcuts.ShortcutColor;
import com.github.service.models.response.type.IssueState;
import com.github.service.models.response.type.StatusState;
import com.github.service.models.response.type.SubscriptionState;
import com.google.android.gms.internal.measurement.b4;
import com.google.android.gms.internal.measurement.i4;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.textfield.TextInputLayout;
import dw.i1;
import dw.j1;
import dw.j3;
import dw.k1;
import dw.k2;
import dw.k3;
import dw.l1;
import dw.l3;
import dw.m3;
import dw.q1;
import dw.r1;
import dw.s5;
import dw.t5;
import gn0.jt;
import hc0.ev;
import hc0.jc;
import hc0.z5;
import java.io.Serializable;
import java.time.ZonedDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import t00.d9;
import u10.l40;
import u10.m40;
import u10.o40;
import u10.p40;
import u10.q40;
import u10.r40;
import u10.s40;
import u10.u40;
import yz0.d3;
import yz0.w7;
import yz0.y1;

/* loaded from: /home/user/work/p/classes3.dex */
public abstract class n {
    public static void A(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean hasOnClickListeners = checkableImageButton.hasOnClickListeners();
        boolean z = onLongClickListener != null;
        boolean z2 = hasOnClickListeners || z;
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(hasOnClickListeners);
        checkableImageButton.setPressable(hasOnClickListeners);
        checkableImageButton.setLongClickable(z);
        checkableImageButton.setImportantForAccessibility(z2 ? 1 : 2);
    }

    public static final String C(kotlinx.serialization.json.c cVar, String str) {
        String a;
        k71.k.g(cVar, "<this>");
        try {
            kotlinx.serialization.json.b bVar = (kotlinx.serialization.json.b) cVar.get(str);
            if (bVar != null) {
                kotlinx.serialization.json.d f = l81.j.f(bVar);
                if (!f.b()) {
                    f = null;
                }
                if (f != null && (a = f.a()) != null) {
                    if (!t71.p.T(a)) {
                        return a;
                    }
                }
            }
        } catch (IllegalArgumentException unused) {
        }
        return null;
    }

    public static final jt D(ShortcutColor shortcutColor) {
        switch (shortcutColor == null ? -1 : vl0.m.a[shortcutColor.ordinal()]) {
            case -1:
                return jt.A;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return jt.u;
            case 2:
                return jt.t;
            case 3:
                return jt.v;
            case 4:
                return jt.w;
            case 5:
                return jt.z;
            case 6:
                return jt.x;
            case 7:
                return jt.y;
        }
    }

    public static final p01.g E(l1 l1Var) {
        StatusState statusState;
        i1 i1Var;
        j1 j1Var;
        i1 i1Var2;
        String str = l1Var.b;
        boolean z = l1Var.c;
        k1 k1Var = l1Var.d;
        String str2 = (k1Var == null || (i1Var2 = k1Var.c) == null) ? null : i1Var2.a;
        if (k1Var == null || (i1Var = k1Var.c) == null || (j1Var = i1Var.b) == null || (statusState = b4.o0(j1Var.a)) == null) {
            statusState = StatusState.UNKNOWN__;
        }
        return new p01.g(str, z, str2, statusState);
    }

    public static final y1 F(w50.l lVar) {
        ev evVar;
        String str;
        int i;
        String str2;
        ArrayList arrayList;
        SubscriptionState subscriptionState;
        k71.k.g(lVar, "<this>");
        w50.f fVar = lVar.m;
        ev evVar2 = lVar.k;
        w50.k kVar = lVar.j;
        ev evVar3 = kVar.d;
        String str3 = lVar.b;
        String str4 = lVar.c;
        String str5 = lVar.d;
        Boolean bool = lVar.g;
        boolean z = true;
        if (bool == null || bool.booleanValue()) {
            z = false;
        }
        int i2 = lVar.h.a;
        boolean z2 = false;
        ZonedDateTime zonedDateTime = lVar.f;
        d3 d3Var = new d3(kVar.f.b, kVar.b);
        SubscriptionState D = a.a.D(evVar3);
        SubscriptionState D2 = a.a.D(evVar2);
        List list = kVar.e;
        SubscriptionState subscriptionState2 = SubscriptionState.IGNORED;
        if (D2 == subscriptionState2 || D == subscriptionState2 || (D == null && D2 == null)) {
            evVar = evVar2;
        } else {
            SubscriptionState subscriptionState3 = SubscriptionState.UNSUBSCRIBED;
            if (D == subscriptionState3 && D2 == subscriptionState3) {
                evVar = evVar2;
            } else {
                evVar = evVar2;
                SubscriptionState subscriptionState4 = SubscriptionState.CUSTOM;
                if (D != subscriptionState4 || D2 != subscriptionState3) {
                    if (D != subscriptionState4 || D2 != subscriptionState4) {
                        z2 = true;
                    } else if (list != null) {
                        z2 = list.contains(z5.u);
                    }
                }
            }
            z2 = false;
        }
        SubscriptionState D3 = a.a.D(evVar3);
        SubscriptionState D4 = a.a.D(evVar);
        SubscriptionState subscriptionState5 = (D4 == subscriptionState2 || D3 == SubscriptionState.SUBSCRIBED || D4 == (subscriptionState = SubscriptionState.UNSUBSCRIBED)) ? subscriptionState2 : subscriptionState;
        SubscriptionState D5 = a.a.D(evVar3);
        SubscriptionState D6 = a.a.D(evVar);
        SubscriptionState subscriptionState6 = SubscriptionState.SUBSCRIBED;
        if (D5 == subscriptionState6 && D6 == null) {
            subscriptionState6 = null;
        }
        SubscriptionState subscriptionState7 = subscriptionState6;
        List c = p.c(lVar.p);
        String str6 = lVar.l;
        int i3 = lVar.e;
        IssueState x0 = i4.x0(lVar.i);
        List list2 = fVar.b;
        if (list2 != null) {
            ArrayList S = x61.m.S(list2);
            str = str6;
            i = i3;
            arrayList = new ArrayList(x61.n.F(S, 10));
            str2 = str3;
            int i4 = 0;
            for (int size = S.size(); i4 < size; size = size) {
                Object obj = S.get(i4);
                i4++;
                arrayList.add(t.e.c(((w50.i) obj).c));
            }
        } else {
            str = str6;
            i = i3;
            str2 = str3;
            arrayList = x61.r.r;
        }
        com.github.rudroid.common.b0 b0Var = new com.github.rudroid.common.b0(fVar.a, arrayList);
        w50.g gVar = lVar.n;
        return new y1(str2, str4, str5, z, zonedDateTime, d3Var, z2, subscriptionState5, subscriptionState7, c, str, i, b0Var, i2, x0, gVar != null ? gVar.a : 0, t.a0.N(lVar.o), (IssueType) null, (h01.p) null, (String) null, kVar.c, (z01.p) null);
    }

    public static final p01.n G(w61.k kVar) {
        int i;
        Object obj = kVar.r;
        m3 m3Var = (m3) obj;
        String str = m3Var.c;
        j3 j3Var = m3Var.h;
        com.github.service.models.response.a aVar = new com.github.service.models.response.a(j3Var.c, w8.s.A(j3Var.d), (String) null, false, (String) null, 60);
        boolean z = m3Var.f;
        String str2 = m3Var.d;
        try {
            l3 l3Var = ((m3) obj).i;
            i = Color.parseColor(l3Var != null ? l3Var.a : null);
        } catch (Exception unused) {
            i = -16777216;
        }
        int i2 = i;
        l3 l3Var2 = m3Var.i;
        String str3 = l3Var2 != null ? l3Var2.b : null;
        String str4 = m3Var.b;
        int i3 = m3Var.r.c;
        fz.j jVar = new fz.j((dw.o) kVar.s);
        boolean z2 = m3Var.r.d;
        String str5 = (m3Var.j || m3Var.l) ? m3Var.k : null;
        String str6 = m3Var.e;
        boolean z3 = m3Var.o;
        k3 k3Var = m3Var.p;
        return new p01.n(str, aVar, z, str2, i2, str3, str4, i3, jVar, z2, str5, str6, z3, k3Var != null ? f1.e.h(k3Var.b.b, "/", k3Var.a) : null);
    }

    public static final Object H(x6.k kVar, k71.e eVar) {
        Bundle a = kVar.y.a();
        if (a == null) {
            a = d((w61.k[]) Arrays.copyOf(new w61.k[0], 0));
        }
        Map f = kVar.s.f();
        LinkedHashMap linkedHashMap = new LinkedHashMap(x61.x.s(f.size()));
        for (Map.Entry entry : f.entrySet()) {
            linkedHashMap.put(entry.getKey(), ((x6.j) entry.getValue()).a);
        }
        return new b7.f(a, linkedHashMap).O0(b91.g.J(eVar));
    }

    public static final SimpleRepository I(t5 t5Var) {
        k71.k.g(t5Var, "<this>");
        String str = t5Var.a;
        String str2 = t5Var.b;
        s5 s5Var = t5Var.d;
        return new SimpleRepository(w8.s.A(s5Var.d), str, str2, s5Var.c, t5Var.c);
    }

    public static final w7 J(o40 o40Var) {
        IssueOrPullRequestState issueOrPullRequestState;
        yz0.s bVar;
        ArrayList arrayList;
        boolean z;
        p40 p40Var;
        l40 l40Var;
        p40 p40Var2;
        p40 p40Var3;
        q40 q40Var;
        p40 p40Var4;
        p40 p40Var5;
        p40 p40Var6;
        p40 p40Var7;
        p40 p40Var8;
        k71.k.g(o40Var, "<this>");
        u40 u40Var = o40Var.a;
        String str = "";
        String str2 = (u40Var == null || (p40Var8 = u40Var.b) == null) ? "" : p40Var8.b;
        jc jcVar = (u40Var == null || (p40Var7 = u40Var.b) == null) ? null : p40Var7.d;
        int i = jcVar == null ? -1 : va0.n.a[jcVar.ordinal()];
        if (i == -1) {
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        } else if (i == 1) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_OPEN;
        } else if (i == 2) {
            issueOrPullRequestState = IssueOrPullRequestState.ISSUE_CLOSED;
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            issueOrPullRequestState = IssueOrPullRequestState.UNKNOWN;
        }
        IssueOrPullRequestState issueOrPullRequestState2 = issueOrPullRequestState;
        ArrayList b = f0.b((u40Var == null || (p40Var6 = u40Var.b) == null) ? null : p40Var6.i);
        List c = p.c((u40Var == null || (p40Var5 = u40Var.b) == null) ? null : p40Var5.j);
        List list = (u40Var == null || (p40Var4 = u40Var.b) == null) ? null : p40Var4.g.a;
        if (list == null) {
            list = x61.r.r;
        }
        ArrayList S = x61.m.S(list);
        ArrayList arrayList2 = new ArrayList(x61.n.F(S, 10));
        int size = S.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = S.get(i2);
            i2++;
            r40 r40Var = (r40) obj;
            s40 s40Var = r40Var.b;
            m40 m40Var = r40Var.a;
            String str3 = str;
            arrayList2.add(new xz0.f(new SimpleLegacyProject(s40Var.b, s40Var.a, w.C(s40Var.c), m40Var != null ? m40Var.a : null), m40Var != null ? m40Var.a : null));
            str = str3;
        }
        String str4 = str;
        bb0.g e = s.e((u40Var == null || (p40Var3 = u40Var.b) == null || (q40Var = p40Var3.f) == null) ? null : q40Var.c);
        c40.c cVar = (u40Var == null || (p40Var2 = u40Var.b) == null) ? null : p40Var2.k;
        if (cVar == null) {
            yz0.s.Companion.getClass();
            bVar = yz0.r.b;
        } else {
            c40.c a = c40.c.a(cVar, u40Var.b.e, null, 4031);
            p40 p40Var9 = u40Var.b;
            bVar = new bb0.b(a, p40Var9.c, new yz0.a0(p40Var9.b));
        }
        com.github.service.models.response.a aVar = new com.github.service.models.response.a((u40Var == null || (l40Var = u40Var.a) == null) ? str4 : l40Var.b, (Avatar) null, (String) null, false, (String) null, 62);
        ArrayList arrayList3 = new ArrayList();
        if (u40Var == null || (p40Var = u40Var.b) == null || !p40Var.h) {
            arrayList = b;
            z = false;
        } else {
            z = true;
            arrayList = b;
        }
        return new w7(str2, issueOrPullRequestState2, arrayList, c, arrayList2, e, bVar, aVar, arrayList3, z);
    }

    public static int M(int i) {
        int[] iArr = {1, 2, 3};
        for (int i2 = 0; i2 < 3; i2++) {
            int i3 = iArr[i2];
            int i4 = i3 - 1;
            if (i3 == 0) {
                throw null;
            }
            if (i4 == i) {
                return i3;
            }
        }
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x008f, code lost:
    
        if (r6.j(r7, r2, r0) == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x004c, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(com.github.service.wrapper.b bVar, j71.c cVar, c71.c cVar2) {
        d9 d9Var;
        int i;
        ox.f fVar;
        if (cVar2 instanceof d9) {
            d9Var = (d9) cVar2;
            int i2 = d9Var.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                d9Var.x = i2 - Integer.MIN_VALUE;
                Object obj = d9Var.w;
                b71.a aVar = b71.a.r;
                i = d9Var.x;
                if (i != 0) {
                    y.j(obj);
                    ox.i iVar = new ox.i();
                    d9Var.u = bVar;
                    d9Var.v = cVar;
                    d9Var.x = 1;
                    obj = bVar.f(iVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        y.j(obj);
                        return w61.a0.a;
                    }
                    cVar = d9Var.v;
                    bVar = d9Var.u;
                    y.j(obj);
                }
                fVar = (ox.f) obj;
                if (fVar != null) {
                    ox.h hVar = fVar.a;
                    ox.f fVar2 = new ox.f(new ox.h(hVar.a, new ox.g(((Number) cVar.k(new Integer(hVar.b.a))).intValue()), hVar.c), fVar.b, fVar.c);
                    ox.i iVar2 = new ox.i();
                    d9Var.u = null;
                    d9Var.v = null;
                    d9Var.x = 2;
                }
                return w61.a0.a;
            }
        }
        d9Var = new d9(cVar2);
        Object obj2 = d9Var.w;
        b71.a aVar2 = b71.a.r;
        i = d9Var.x;
        if (i != 0) {
        }
        fVar = (ox.f) obj2;
        if (fVar != null) {
        }
        return w61.a0.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final p01.g b(k2 k2Var) {
        String str;
        l1 l1Var;
        String str2;
        k1 k1Var;
        i1 i1Var;
        StatusState o0;
        k1 k1Var2;
        i1 i1Var2;
        j1 j1Var;
        k1 k1Var3;
        i1 i1Var3;
        j1 j1Var2;
        i1 i1Var4;
        r1 r1Var = k2Var.e;
        q1 q1Var = k2Var.f;
        if (r1Var != null) {
            l1Var = r1Var.c;
        } else {
            if (q1Var == null) {
                str = "main";
                str2 = null;
                boolean b = k71.k.b(r1Var == null ? Boolean.valueOf(r1Var.c.c) : q1Var != null ? Boolean.valueOf(q1Var.c.c) : null, Boolean.TRUE);
                if (r1Var != null) {
                    k1 k1Var4 = r1Var.c.d;
                    String str3 = (k1Var4 == null || (i1Var4 = k1Var4.c) == null) ? null : i1Var4.a;
                    if (str3 != null) {
                        str2 = str3;
                        if (r1Var != null || (k1Var3 = r1Var.c.d) == null || (i1Var3 = k1Var3.c) == null || (j1Var2 = i1Var3.b) == null || (o0 = b4.o0(j1Var2.a)) == null) {
                            o0 = (q1Var != null || (k1Var2 = q1Var.c.d) == null || (i1Var2 = k1Var2.c) == null || (j1Var = i1Var2.b) == null) ? StatusState.UNKNOWN__ : b4.o0(j1Var.a);
                        }
                        return new p01.g(str, b, str2, o0);
                    }
                }
                if (q1Var != null && (k1Var = q1Var.c.d) != null && (i1Var = k1Var.c) != null) {
                    str2 = i1Var.a;
                }
                if (r1Var != null) {
                }
                if (q1Var != null) {
                }
                return new p01.g(str, b, str2, o0);
            }
            l1Var = q1Var.c;
        }
        str = l1Var.b;
        str2 = null;
        boolean b2 = k71.k.b(r1Var == null ? Boolean.valueOf(r1Var.c.c) : q1Var != null ? Boolean.valueOf(q1Var.c.c) : null, Boolean.TRUE);
        if (r1Var != null) {
        }
        if (q1Var != null) {
            str2 = i1Var.a;
        }
        if (r1Var != null) {
        }
        if (q1Var != null) {
        }
        return new p01.g(str, b2, str2, o0);
    }

    public static void c(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList, PorterDuff.Mode mode) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (drawable != null) {
            drawable = drawable.mutate();
            if (colorStateList == null || !colorStateList.isStateful()) {
                drawable.setTintList(colorStateList);
            } else {
                int[] drawableState = textInputLayout.getDrawableState();
                int[] drawableState2 = checkableImageButton.getDrawableState();
                int length = drawableState.length;
                int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
                System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
                drawable.setTintList(ColorStateList.valueOf(colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor())));
            }
            if (mode != null) {
                drawable.setTintMode(mode);
            }
        }
        if (checkableImageButton.getDrawable() != drawable) {
            checkableImageButton.setImageDrawable(drawable);
        }
    }

    public static final Bundle d(w61.k... kVarArr) {
        Bundle bundle = new Bundle(kVarArr.length);
        for (w61.k kVar : kVarArr) {
            String str = (String) kVar.r;
            Object obj = kVar.s;
            if (obj == null) {
                bundle.putString(str, null);
            } else if (obj instanceof Boolean) {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Byte) {
                bundle.putByte(str, ((Number) obj).byteValue());
            } else if (obj instanceof Character) {
                bundle.putChar(str, ((Character) obj).charValue());
            } else if (obj instanceof Double) {
                bundle.putDouble(str, ((Number) obj).doubleValue());
            } else if (obj instanceof Float) {
                bundle.putFloat(str, ((Number) obj).floatValue());
            } else if (obj instanceof Integer) {
                bundle.putInt(str, ((Number) obj).intValue());
            } else if (obj instanceof Long) {
                bundle.putLong(str, ((Number) obj).longValue());
            } else if (obj instanceof Short) {
                bundle.putShort(str, ((Number) obj).shortValue());
            } else if (obj instanceof Bundle) {
                bundle.putBundle(str, (Bundle) obj);
            } else if (obj instanceof CharSequence) {
                bundle.putCharSequence(str, (CharSequence) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable(str, (Parcelable) obj);
            } else if (obj instanceof boolean[]) {
                bundle.putBooleanArray(str, (boolean[]) obj);
            } else if (obj instanceof byte[]) {
                bundle.putByteArray(str, (byte[]) obj);
            } else if (obj instanceof char[]) {
                bundle.putCharArray(str, (char[]) obj);
            } else if (obj instanceof double[]) {
                bundle.putDoubleArray(str, (double[]) obj);
            } else if (obj instanceof float[]) {
                bundle.putFloatArray(str, (float[]) obj);
            } else if (obj instanceof int[]) {
                bundle.putIntArray(str, (int[]) obj);
            } else if (obj instanceof long[]) {
                bundle.putLongArray(str, (long[]) obj);
            } else if (obj instanceof short[]) {
                bundle.putShortArray(str, (short[]) obj);
            } else if (obj instanceof Object[]) {
                Class<?> componentType = obj.getClass().getComponentType();
                k71.k.d(componentType);
                if (Parcelable.class.isAssignableFrom(componentType)) {
                    bundle.putParcelableArray(str, (Parcelable[]) obj);
                } else if (String.class.isAssignableFrom(componentType)) {
                    bundle.putStringArray(str, (String[]) obj);
                } else if (CharSequence.class.isAssignableFrom(componentType)) {
                    bundle.putCharSequenceArray(str, (CharSequence[]) obj);
                } else {
                    if (!Serializable.class.isAssignableFrom(componentType)) {
                        throw new IllegalArgumentException("Illegal value array type " + componentType.getCanonicalName() + " for key \"" + str + '\"');
                    }
                    bundle.putSerializable(str, (Serializable) obj);
                }
            } else if (obj instanceof Serializable) {
                bundle.putSerializable(str, (Serializable) obj);
            } else if (obj instanceof IBinder) {
                bundle.putBinder(str, (IBinder) obj);
            } else if (obj instanceof Size) {
                bundle.putSize(str, (Size) obj);
            } else {
                if (!(obj instanceof SizeF)) {
                    throw new IllegalArgumentException("Illegal value type " + obj.getClass().getCanonicalName() + " for key \"" + str + '\"');
                }
                bundle.putSizeF(str, (SizeF) obj);
            }
        }
        return bundle;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0092, code lost:
    
        if (((1676673024 >> java.lang.Character.getType(r8)) & 1) == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0074, code lost:
    
        if (((1676673024 >> java.lang.Character.getType(r7)) & 1) == 0) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static w61.k g(x91.c cVar, b21.v vVar, b21.v vVar2, boolean z) {
        boolean z2;
        k71.k.g(vVar, "left");
        k71.k.g(vVar2, "right");
        boolean z3 = true;
        boolean z4 = !v(vVar2, 1) && (!s(vVar2, 1) || v(vVar, -1) || s(vVar, -1));
        boolean z5 = (vVar.d(-1) == ((x91.c) vVar.t).a(vVar.o(0).b) || v(vVar, -1) || (s(vVar, -1) && !v(vVar2, 1) && !s(vVar2, 1))) ? false : true;
        if (z) {
            z2 = z4;
        } else {
            if (z4) {
                if (z5) {
                    char d = vVar.d(-1);
                    if (!t71.p.J("$^`", d)) {
                    }
                }
                z2 = true;
            }
            z2 = false;
        }
        if (z) {
            z3 = z5;
        } else {
            if (z5) {
                if (z4) {
                    char d2 = vVar2.d(1);
                    if (!t71.p.J("$^`", d2)) {
                    }
                }
            }
            z3 = false;
        }
        return new w61.k(Boolean.valueOf(z2), Boolean.valueOf(z3));
    }

    public static ImageView.ScaleType h(int i) {
        return i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 5 ? i != 6 ? ImageView.ScaleType.CENTER : ImageView.ScaleType.CENTER_INSIDE : ImageView.ScaleType.CENTER_CROP : ImageView.ScaleType.FIT_END : ImageView.ScaleType.FIT_CENTER : ImageView.ScaleType.FIT_START : ImageView.ScaleType.FIT_XY;
    }

    public static boolean r(int i, CharSequence charSequence) {
        k71.k.g(charSequence, "line");
        int length = charSequence.length();
        Character ch2 = null;
        int i2 = 0;
        int i3 = 1;
        while (true) {
            if (i < length) {
                char charAt = charSequence.charAt(i);
                if (ch2 == null) {
                    if (charAt != '*' && charAt != '-' && charAt != '_') {
                        if (i2 >= 3 || charAt != ' ') {
                            break;
                        }
                        i2++;
                    } else {
                        ch2 = Character.valueOf(charAt);
                    }
                    i++;
                } else {
                    if (charAt != ch2.charValue()) {
                        if (charAt != ' ' && charAt != '\t') {
                            break;
                        }
                    } else {
                        i3++;
                    }
                    i++;
                }
            } else if (i3 >= 3) {
                return true;
            }
        }
        return false;
    }

    public static boolean s(b21.v vVar, int i) {
        k71.k.g(vVar, "info");
        char d = vVar.d(i);
        return t71.p.J("$^`", d) || ((1676673024 >> Character.getType(d)) & 1) != 0;
    }

    public static boolean v(b21.v vVar, int i) {
        k71.k.g(vVar, "info");
        char d = vVar.d(i);
        return d == 0 || Character.isSpaceChar(d) || r.s(d);
    }

    public static final LinkedHashMap w(kotlinx.serialization.json.c cVar) {
        Set<Map.Entry> entrySet = cVar.r.entrySet();
        int s = x61.x.s(x61.n.F(entrySet, 10));
        if (s < 16) {
            s = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(s);
        for (Map.Entry entry : entrySet) {
            String str = (String) entry.getKey();
            kotlinx.serialization.json.d dVar = (kotlinx.serialization.json.b) entry.getValue();
            kotlinx.serialization.json.d dVar2 = dVar instanceof kotlinx.serialization.json.d ? dVar : null;
            if (dVar2 != null) {
                kotlinx.serialization.json.d dVar3 = dVar2.b() ? dVar2 : null;
                if (dVar3 != null && (r3 = dVar3.a()) != null) {
                    linkedHashMap.put(str, r3);
                }
            }
            String obj = dVar.toString();
            linkedHashMap.put(str, obj);
        }
        return linkedHashMap;
    }

    public static void y(TextInputLayout textInputLayout, CheckableImageButton checkableImageButton, ColorStateList colorStateList) {
        Drawable drawable = checkableImageButton.getDrawable();
        if (checkableImageButton.getDrawable() == null || colorStateList == null || !colorStateList.isStateful()) {
            return;
        }
        int[] drawableState = textInputLayout.getDrawableState();
        int[] drawableState2 = checkableImageButton.getDrawableState();
        int length = drawableState.length;
        int[] copyOf = Arrays.copyOf(drawableState, drawableState.length + drawableState2.length);
        System.arraycopy(drawableState2, 0, copyOf, length, drawableState2.length);
        int colorForState = colorStateList.getColorForState(copyOf, colorStateList.getDefaultColor());
        Drawable mutate = drawable.mutate();
        mutate.setTintList(ColorStateList.valueOf(colorForState));
        checkableImageButton.setImageDrawable(mutate);
    }

    public abstract boolean B(View view, float f);

    public abstract void K(ViewGroup.MarginLayoutParams marginLayoutParams, int i);

    public abstract void L(ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2);

    public abstract int e(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract float f(int i);

    public abstract int i(ViewGroup.MarginLayoutParams marginLayoutParams);

    public abstract int j();

    public abstract int k();

    public abstract int l();

    public abstract int m();

    public abstract int n(View view);

    public abstract int o(CoordinatorLayout coordinatorLayout);

    public abstract int p();

    public abstract boolean q(float f);

    public abstract boolean t(View view);

    public abstract boolean u(float f, float f2);

    public abstract void x(x91.c cVar, x91.g gVar, ArrayList arrayList, q81.k kVar);

    public abstract int z(x91.c cVar, b21.v vVar, ArrayList arrayList);

    // [restore] вложенный стаб: оригинал потерян при декомпиляции
    public static class CoordinatorLayout<T1,T2,T3,T4> {
        public CoordinatorLayout() {
        }
    }
}
