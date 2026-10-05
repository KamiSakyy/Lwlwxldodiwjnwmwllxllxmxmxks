package n81;

import android.content.Intent;
import android.net.Uri;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class b {
    public static final Intent a = new Intent().setAction("android.intent.action.VIEW").addCategory("android.intent.category.BROWSABLE").setData(Uri.fromParts("http", "", null));
}
