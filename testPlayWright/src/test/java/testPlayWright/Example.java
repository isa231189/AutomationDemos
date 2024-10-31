package testPlayWright;

import com.microsoft.playwright.*;
import com.microsoft.playwright.options.*;
import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    try (Playwright playwright = Playwright.create()) {
      Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions()
        .setHeadless(false));
      BrowserContext context = browser.newContext();
      Page page = context.newPage();
      page.navigate("https://www.google.com/");
      page.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).click();
      page.getByLabel("Search", new Page.GetByLabelOptions().setExact(true)).fill("temu");
      page.getByLabel("close").click();
      page.getByLabel("Enter email").click();
      page.getByLabel("Enter email").fill("yeisa231189@gmail.com");
      page.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Continue")).click();
      page.locator("iframe").contentFrame().locator("#captchaImg").nth(1).click();
      page.locator("iframe").contentFrame().getByText("Refresh").click();
      page.locator("iframe").contentFrame().getByRole(AriaRole.BUTTON, new FrameLocator.GetByRoleOptions().setName("Confirm")).click();
      page.locator("iframe").contentFrame().getByLabel("close").click();
      page.getByLabel("temu").click();
      Page page1 = page.waitForPopup(() -> {
        page.getByLabel("Google").click();
      });
      page1.getByLabel("Email or phone").click();
      page1.getByLabel("Email or phone").fill("yeisa231189@gmail.com");
      page1.getByLabel("Email or phone").press("Enter");
      page1.getByLabel("Try again").click();
      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Create account")).click();
      page1.getByLabel("First name").fill("isa");
      page1.getByLabel("Last name (optional)").click();
      page1.getByLabel("Last name (optional)").fill("petra");
      page1.getByRole(AriaRole.BUTTON, new Page.GetByRoleOptions().setName("Next")).click();
    }
  }
}