package a31;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import com.google.android.gms.internal.measurement.i4;
import java.io.IOException;
import java.util.Locale;
import o31.o;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/user/work/p/classes4.dex */
public final class c {
    public final b a;
    public final b b = new b();
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;

    public c(Context context) {
        AttributeSet attributeSet;
        int i;
        int next;
        b bVar = new b();
        int i2 = bVar.r;
        if (i2 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i2);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next != 2) {
                    throw new XmlPullParserException("No start tag found");
                }
                if (!TextUtils.equals(xml.getName(), "badge")) {
                    throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                }
                AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                attributeSet = asAttributeSet;
                i = asAttributeSet.getStyleAttribute();
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i2));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        TypedArray f = o.f(context, attributeSet, x21.a.c, 2130968676, i == 0 ? 2132018447 : i, new int[0]);
        Resources resources = context.getResources();
        this.c = f.getDimensionPixelSize(5, -1);
        this.i = context.getResources().getDimensionPixelSize(2131166067);
        this.j = context.getResources().getDimensionPixelSize(2131166070);
        this.d = f.getDimensionPixelSize(15, -1);
        this.e = f.getDimension(13, resources.getDimension(2131165432));
        this.g = f.getDimension(18, resources.getDimension(2131165436));
        this.f = f.getDimension(4, resources.getDimension(2131165432));
        this.h = f.getDimension(14, resources.getDimension(2131165436));
        this.k = f.getInt(25, 1);
        this.l = f.getInt(2, 0);
        b bVar2 = this.b;
        int i3 = bVar.z;
        bVar2.z = i3 == -2 ? 255 : i3;
        int i4 = bVar.B;
        if (i4 != -2) {
            bVar2.B = i4;
        } else if (f.hasValue(24)) {
            this.b.B = f.getInt(24, 0);
        } else {
            this.b.B = -1;
        }
        String str = bVar.A;
        if (str != null) {
            this.b.A = str;
        } else if (f.hasValue(8)) {
            this.b.A = f.getString(8);
        }
        b bVar3 = this.b;
        bVar3.F = bVar.F;
        CharSequence charSequence = bVar.G;
        bVar3.G = charSequence == null ? context.getString(2131953248) : charSequence;
        b bVar4 = this.b;
        int i5 = bVar.H;
        bVar4.H = i5 == 0 ? 2131820589 : i5;
        int i6 = bVar.I;
        bVar4.I = i6 == 0 ? 2131953263 : i6;
        Boolean bool = bVar.K;
        bVar4.K = Boolean.valueOf(bool == null || bool.booleanValue());
        b bVar5 = this.b;
        int i7 = bVar.C;
        bVar5.C = i7 == -2 ? f.getInt(22, -2) : i7;
        b bVar6 = this.b;
        int i8 = bVar.D;
        bVar6.D = i8 == -2 ? f.getInt(23, -2) : i8;
        b bVar7 = this.b;
        Integer num = bVar.v;
        bVar7.v = Integer.valueOf(num == null ? f.getResourceId(6, 2132017696) : num.intValue());
        b bVar8 = this.b;
        Integer num2 = bVar.w;
        bVar8.w = Integer.valueOf(num2 == null ? f.getResourceId(7, 0) : num2.intValue());
        b bVar9 = this.b;
        Integer num3 = bVar.x;
        bVar9.x = Integer.valueOf(num3 == null ? f.getResourceId(16, 2132017696) : num3.intValue());
        b bVar10 = this.b;
        Integer num4 = bVar.y;
        bVar10.y = Integer.valueOf(num4 == null ? f.getResourceId(17, 0) : num4.intValue());
        b bVar11 = this.b;
        Integer num5 = bVar.s;
        bVar11.s = Integer.valueOf(num5 == null ? i4.W(context, f, 1).getDefaultColor() : num5.intValue());
        b bVar12 = this.b;
        Integer num6 = bVar.u;
        bVar12.u = Integer.valueOf(num6 == null ? f.getResourceId(9, 2132017883) : num6.intValue());
        Integer num7 = bVar.t;
        if (num7 != null) {
            this.b.t = num7;
        } else if (f.hasValue(10)) {
            this.b.t = Integer.valueOf(i4.W(context, f, 10).getDefaultColor());
        } else {
            int intValue = this.b.u.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue, j.a.x);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList W = i4.W(context, obtainStyledAttributes, 3);
            i4.W(context, obtainStyledAttributes, 4);
            i4.W(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i9 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i9, 0);
            obtainStyledAttributes.getString(i9);
            obtainStyledAttributes.getBoolean(14, false);
            i4.W(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue, x21.a.B);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.getString(obtainStyledAttributes2.hasValue(3) ? 3 : 1);
            obtainStyledAttributes2.recycle();
            this.b.t = Integer.valueOf(W.getDefaultColor());
        }
        b bVar13 = this.b;
        Integer num8 = bVar.J;
        bVar13.J = Integer.valueOf(num8 == null ? f.getInt(3, 8388661) : num8.intValue());
        b bVar14 = this.b;
        Integer num9 = bVar.L;
        bVar14.L = Integer.valueOf(num9 == null ? f.getDimensionPixelSize(12, resources.getDimensionPixelSize(2131166068)) : num9.intValue());
        b bVar15 = this.b;
        Integer num10 = bVar.M;
        bVar15.M = Integer.valueOf(num10 == null ? f.getDimensionPixelSize(11, resources.getDimensionPixelSize(2131165438)) : num10.intValue());
        b bVar16 = this.b;
        Integer num11 = bVar.N;
        bVar16.N = Integer.valueOf(num11 == null ? f.getDimensionPixelOffset(19, 0) : num11.intValue());
        b bVar17 = this.b;
        Integer num12 = bVar.O;
        bVar17.O = Integer.valueOf(num12 == null ? f.getDimensionPixelOffset(26, 0) : num12.intValue());
        b bVar18 = this.b;
        Integer num13 = bVar.P;
        bVar18.P = Integer.valueOf(num13 == null ? f.getDimensionPixelOffset(20, bVar18.N.intValue()) : num13.intValue());
        b bVar19 = this.b;
        Integer num14 = bVar.Q;
        bVar19.Q = Integer.valueOf(num14 == null ? f.getDimensionPixelOffset(27, bVar19.O.intValue()) : num14.intValue());
        b bVar20 = this.b;
        Integer num15 = bVar.T;
        bVar20.T = Integer.valueOf(num15 == null ? f.getDimensionPixelOffset(21, 0) : num15.intValue());
        b bVar21 = this.b;
        Integer num16 = bVar.R;
        bVar21.R = Integer.valueOf(num16 == null ? 0 : num16.intValue());
        b bVar22 = this.b;
        Integer num17 = bVar.S;
        bVar22.S = Integer.valueOf(num17 == null ? 0 : num17.intValue());
        b bVar23 = this.b;
        Boolean bool2 = bVar.U;
        bVar23.U = Boolean.valueOf(bool2 == null ? f.getBoolean(0, false) : bool2.booleanValue());
        f.recycle();
        Locale locale = bVar.E;
        if (locale == null) {
            this.b.E = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            this.b.E = locale;
        }
        this.a = bVar;
    }
}
