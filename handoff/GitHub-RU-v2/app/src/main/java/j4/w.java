package j4;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: /home/user/work/p/classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray f27205a = new SparseArray();

    /* renamed from: b, reason: collision with root package name */
    public int f27206b;

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public w(Context context, XmlResourceParser xmlResourceParser) {
        this.f27206b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.f27190r);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.f27206b = obtainStyledAttributes.getResourceId(index, this.f27206b);
            }
        }
        obtainStyledAttributes.recycle();
        try {
            int eventType = xmlResourceParser.getEventType();
            u uVar = null;
            while (eventType != 1) {
                if (eventType == 2) {
                    String name = xmlResourceParser.getName();
                    switch (name.hashCode()) {
                        case 80204913:
                            if (name.equals("State")) {
                                uVar = new u(context, xmlResourceParser);
                                this.f27205a.put(uVar.f27197a, uVar);
                                break;
                            } else {
                                break;
                            }
                        case 1301459538:
                            name.equals("LayoutDescription");
                            break;
                        case 1382829617:
                            name.equals("StateSet");
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                v vVar = new v(context, xmlResourceParser);
                                if (uVar != null) {
                                    uVar.f27198b.add(vVar);
                                    break;
                                } else {
                                    break;
                                }
                            } else {
                                break;
                            }
                    }
                } else if (eventType != 3) {
                    continue;
                } else if ("StateSet".equals(xmlResourceParser.getName())) {
                    return;
                }
                eventType = xmlResourceParser.next();
            }
        } catch (IOException | XmlPullParserException unused) {
        }
    }

    public int a(int i) {
        float f6 = -1;
        SparseArray sparseArray = this.f27205a;
        int i10 = 0;
        if (-1 == i) {
            u uVar = i == -1 ? (u) sparseArray.valueAt(0) : (u) sparseArray.get(-1);
            if (uVar != null) {
                ArrayList arrayList = uVar.f27198b;
                while (true) {
                    if (i10 >= arrayList.size()) {
                        i10 = -1;
                        break;
                    }
                    if (((v) arrayList.get(i10)).a(f6, f6)) {
                        break;
                    }
                    i10++;
                }
                if (-1 != i10) {
                    return i10 == -1 ? uVar.f27199c : ((v) arrayList.get(i10)).f27204e;
                }
            }
        } else {
            u uVar2 = (u) sparseArray.get(i);
            if (uVar2 != null) {
                ArrayList arrayList2 = uVar2.f27198b;
                while (true) {
                    if (i10 >= arrayList2.size()) {
                        i10 = -1;
                        break;
                    }
                    if (((v) arrayList2.get(i10)).a(f6, f6)) {
                        break;
                    }
                    i10++;
                }
                return i10 == -1 ? uVar2.f27199c : ((v) arrayList2.get(i10)).f27204e;
            }
        }
        return -1;
    }
}
