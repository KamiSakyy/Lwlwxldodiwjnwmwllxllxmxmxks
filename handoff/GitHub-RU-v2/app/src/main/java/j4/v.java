package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;

/* loaded from: /home/user/work/p/classes.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    public final float f27200a;

    /* renamed from: b, reason: collision with root package name */
    public final float f27201b;

    /* renamed from: c, reason: collision with root package name */
    public final float f27202c;

    /* renamed from: d, reason: collision with root package name */
    public final float f27203d;

    /* renamed from: e, reason: collision with root package name */
    public final int f27204e;

    public v(Context context, XmlResourceParser xmlResourceParser) {
        this.f27200a = Float.NaN;
        this.f27201b = Float.NaN;
        this.f27202c = Float.NaN;
        this.f27203d = Float.NaN;
        this.f27204e = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f27193u);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f27204e);
                this.f27204e = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            } else if (index == 1) {
                this.f27203d = obtainStyledAttributes.getDimension(index, this.f27203d);
            } else if (index == 2) {
                this.f27201b = obtainStyledAttributes.getDimension(index, this.f27201b);
            } else if (index == 3) {
                this.f27202c = obtainStyledAttributes.getDimension(index, this.f27202c);
            } else if (index == 4) {
                this.f27200a = obtainStyledAttributes.getDimension(index, this.f27200a);
            }
        }
        obtainStyledAttributes.recycle();
    }

    public final boolean a(float f6, float f10) {
        float f11 = this.f27200a;
        if (!Float.isNaN(f11) && f6 < f11) {
            return false;
        }
        float f12 = this.f27201b;
        if (!Float.isNaN(f12) && f10 < f12) {
            return false;
        }
        float f13 = this.f27202c;
        if (!Float.isNaN(f13) && f6 > f13) {
            return false;
        }
        float f14 = this.f27203d;
        return Float.isNaN(f14) || f10 <= f14;
    }
}
