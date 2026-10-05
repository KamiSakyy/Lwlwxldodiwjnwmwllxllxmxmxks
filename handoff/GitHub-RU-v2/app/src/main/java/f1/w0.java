package f1;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: /home/user/work/p/classes.dex */
public abstract class w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap f23947a = new WeakHashMap();

    public static String a(int i, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        String str = "1.40.false." + locale.toLanguageTag();
        WeakHashMap weakHashMap = f23947a;
        Object obj = weakHashMap.get(str);
        Object obj2 = obj;
        if (obj == null) {
            NumberFormat integerInstance = NumberFormat.getIntegerInstance(locale);
            integerInstance.setGroupingUsed(false);
            integerInstance.setMinimumIntegerDigits(1);
            integerInstance.setMaximumIntegerDigits(40);
            weakHashMap.put(str, integerInstance);
            obj2 = integerInstance;
        }
        return ((NumberFormat) obj2).format(Integer.valueOf(i));
    }
}
