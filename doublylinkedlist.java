

    public static void main(String[] args) {
        BrowserHistory browser = new BrowserHistory();

        // Visiting pages
        browser.visit("google.com");
        browser.visit("youtube.com");
        browser.visit("github.com");

        System.out.println(browser.getCurrentPage()); // Output: github.com

        // Going back
        System.out.println(browser.back());  // Output: youtube.com
        System.out.println(browser.back());  // Output: google.com
        System.out.println(browser.back());  // Output: No previous page

        // Going forward
        System.out.println(browser.forward());  // Output: youtube.com
        System.out.println(browser.forward());  // Output: github.com
        System.out.println(browser.forward());  // Output: No next page

        // Visiting a new page, clearing forward history
        browser.visit("stackoverflow.com");
        System.out.println(browser.getCurrentPage());  // Output: stackoverflow.com

        // Going back
        System.out.println(browser.back());  // Output: github.com
        System.out.println(browser.back());  // Output: youtube.com
        System.out.println(browser.back());  // Output: google.com

        // No forward history left
        System.out.println(browser.forward());  // Output: No next page
    }


