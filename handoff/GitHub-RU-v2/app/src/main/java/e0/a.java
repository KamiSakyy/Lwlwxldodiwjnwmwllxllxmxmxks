package e0;

import android.R;
import android.content.res.XmlResourceParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f21803a = {R.attr.drawable};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f21804b = {R.attr.name, R.attr.animation};

    /* renamed from: c, reason: collision with root package name */
    public static final int[] f21805c = {R.attr.interpolator, R.attr.duration, R.attr.startOffset, R.attr.repeatCount, R.attr.repeatMode, R.attr.valueFrom, R.attr.valueTo, R.attr.valueType};

    /* renamed from: d, reason: collision with root package name */
    public static final int[] f21806d = {R.attr.ordering};

    /* renamed from: e, reason: collision with root package name */
    public static final int[] f21807e = {R.attr.valueFrom, R.attr.valueTo, R.attr.valueType, R.attr.propertyName};

    /* renamed from: f, reason: collision with root package name */
    public static final int[] f21808f = {R.attr.value, R.attr.interpolator, R.attr.valueType, R.attr.fraction};

    /* renamed from: g, reason: collision with root package name */
    public static final int[] f21809g = {R.attr.propertyName, R.attr.pathData, R.attr.propertyXName, R.attr.propertyYName};

    /* renamed from: h, reason: collision with root package name */
    public static final int[] f21810h = {R.attr.tension, R.attr.extraTension};
    public static final int[] i = {R.attr.factor};

    /* renamed from: j, reason: collision with root package name */
    public static final int[] f21811j = {R.attr.factor};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f21812k = {R.attr.cycles};
    public static final int[] l = {R.attr.tension};
    public static final int[] m = {R.attr.controlX1, R.attr.controlY1, R.attr.controlX2, R.attr.controlY2, R.attr.pathData};

    public static final boolean a(XmlResourceParser xmlResourceParser) {
        return xmlResourceParser.getEventType() == 1 || (xmlResourceParser.getDepth() < 1 && xmlResourceParser.getEventType() == 3);
    }

    public static final void b(XmlResourceParser xmlResourceParser) {
        int next = xmlResourceParser.next();
        while (next != 2 && next != 1) {
            next = xmlResourceParser.next();
        }
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
    }
}
