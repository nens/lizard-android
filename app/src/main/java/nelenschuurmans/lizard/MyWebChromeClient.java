package nelenschuurmans.lizard;

import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;

public class MyWebChromeClient extends WebChromeClient {
    public void onPermissionRequest(PermissionRequest pr) {
        pr.grant(pr.getResources());
    }
}
