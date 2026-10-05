package a61;

import android.os.Message;
import java.util.Comparator;

/* loaded from: /home/user/work/p/classes4.dex */
public final class b1 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return sy.t.g(Long.valueOf(((Message) obj).getWhen()), Long.valueOf(((Message) obj2).getWhen()));
    }




















}
