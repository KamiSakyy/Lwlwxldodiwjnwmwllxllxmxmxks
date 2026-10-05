package aa1;

import ea1.s;
import java.nio.charset.Charset;
import java.util.regex.Pattern;

/* loaded from: /home/user/work/p/classes5.dex */
public abstract class a {
    public static final Charset a;

    static {
        Pattern.compile("(?i)\\bcharset=\\s*(?:[\"'])?([^\\s,;\"']*)");
        Charset forName = Charset.forName("UTF-8");
        a = forName;
        forName.name();
        "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        s.N("meta[http-equiv=content-type], meta[charset]");
    }
}
