package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import java.util.ArrayList;

/* loaded from: /home/user/work/p/classes.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    public final int f27197a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f27198b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final int f27199c;

    public u(Context context, XmlResourceParser xmlResourceParser) {
        this.f27199c = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f27189q);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f27197a = obtainStyledAttributes.getResourceId(index, this.f27197a);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.f27199c);
                this.f27199c = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                "layout".equals(resourceTypeName);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
