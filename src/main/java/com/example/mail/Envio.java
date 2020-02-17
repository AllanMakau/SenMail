package com.example.mail;

public class Envio {

	private static String origem  = System.getProperty("email.origem");
	private static String destino = System.getProperty("email.destino");
	private static String usuario = System.getProperty("email.usuario");
	private static String senha =   System.getProperty("email.senha");
	
	public static void main(String[] args) {
	
		
		try {
			Evento evento = new Evento(origem, destino, "testando envio de email", corpo);
			EmailConfig config = new EmailConfig("smtp.gmail.com", 587L, usuario, senha);
			new EnvioEmail().envio(evento, config);
			
		} catch (Exception e) {
			System.out.println("Erro ao enviar email...  "+ e.getMessage() );
		}

	}
	
	private static String corpo = 
	"<!DOCTYPE html>\r\n" + 
	"<html lang=\"en\">\r\n" + 
	"  <head>\r\n" + 
	"    <meta charset=\"utf-8\">\r\n" + 
	"    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n" + 
	"\r\n" + 
	"    <!-- Set the title of your site here -->\r\n" + 
	"    <title> HTML Patterns </title>\r\n" + 
	"\r\n" + 
	"    <meta name=\"author\" content=\"mrmrs\">\r\n" + 
	"    <meta name=\"description\" content=\"Common HTML patterns\">\r\n" + 
	"    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n" + 
	"\r\n" + 
	"    <!-- Link to your stylesheet here \r\n" + 
	"    <link rel=\"stylesheet\" href=\"css/i.css\">\r\n" + 
	"    Favicons and Touch Device Icons \r\n" + 
	"    <link rel=\"shortcut icon\" href=\"favicon.ico\">\r\n" + 
	"    <link rel=\"apple-touch-icon\" href=\"touch-icon-iphone-precomposed.png\">\r\n" + 
	"    <link rel=\"apple-touch-icon\" sizes=\"72x72\"   href=\"touch-icon-ipad-precomposed.png\">\r\n" + 
	"    <link rel=\"apple-touch-icon\" sizes=\"114x114\" href=\"touch-icon-iphone-retina-precomposed.png\">\r\n" + 
	"    <link rel=\"apple-touch-icon\" sizes=\"144x144\" href=\"touch-icon-ipad-retina-precomposed.png\">\r\n" + 
	"    -->\r\n" + 
	"  </head>\r\n" + 
	"\r\n" + 
	"  <body>\r\n" + 
	"\r\n" + 
	"    <header>\r\n" + 
	"      <h1>HTML</h1>\r\n" + 
	"      <h2>Every html element in one place. Just waiting to be styled.</h2>\r\n" + 
	"    </header>\r\n" + 
	"\r\n" + 
	"\r\n" + 
	"\r\n" + 
	"    <!--\r\n" + 
	"    HTML - Common patterns\r\n" + 
	"    Add your own modules and components for easy theme styling,\r\n" + 
	"    copy the partials for building a prototype. Or just read\r\n" + 
	"    the comments to familiarize yourself with HTML.\r\n" + 
	"    -->\r\n" + 
	"\r\n" + 
	"    <header>\r\n" + 
	"      <a href=\"\" title=\"Site title\"><h1>Site title</h1></a>\r\n" + 
	"      <nav>\r\n" + 
	"        <ul>\r\n" + 
	"          <li> <a href=\"#\" title=\"Home\">Home</a> </li>\r\n" + 
	"          <li> <a href=\"#\" title=\"About\">About</a> </li>\r\n" + 
	"          <li> <a href=\"#\" title=\"Sign Up\">Sign Up</a> </li>\r\n" + 
	"          <li> <a href=\"#\" title=\"Contact\">Contact</a> </li>\r\n" + 
	"          <li> <a href=\"#\" title=\"Careers\">Careers</a> </li>\r\n" + 
	"        </ul>\r\n" + 
	"      </nav>\r\n" + 
	"    </header>\r\n" + 
	"\r\n" + 
	"    <section>\r\n" + 
	"      <h>Headings &amp; Copy</h1>\r\n" + 
	"      <h1>First Header h1</h1>\r\n" + 
	"      <p>\r\n" + 
	"        At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis\r\n" + 
	"        praesentium voluptatum deleniti atque corrupti quos.\r\n" + 
	"      </p>\r\n" + 
	"      <h2>Second header h2</h2>\r\n" + 
	"      <p>\r\n" + 
	"        Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod\r\n" + 
	"        tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n" + 
	"        quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n" + 
	"        consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n" + 
	"        cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat\r\n" + 
	"        non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\n" + 
	"      </p>\r\n" + 
	"      <h3>Third header h3</h3>\r\n" + 
	"      <p>\r\n" + 
	"        At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis\r\n" + 
	"        praesentium voluptatum deleniti atque corrupti quos dolores et quas\r\n" + 
	"        molestias excepturi sint occaecati cupiditate non provident, similique sunt\r\n" + 
	"        in culpa qui officia deserunt mollitia animi, id est laborum et dolorum\r\n" + 
	"        fuga. Et harum quidem rerum facilis est et expedita distinctio.\r\n" + 
	"      </p>\r\n" + 
	"      <h4>Fourth header h4</h4>\r\n" + 
	"      <p>\r\n" + 
	"        Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet,\r\n" + 
	"        consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt\r\n" + 
	"        ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima\r\n" + 
	"        veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi\r\n" + 
	"        ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit\r\n" + 
	"        qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum\r\n" + 
	"        qui dolorem eum fugiat quo voluptas nulla pariatur?\"\r\n" + 
	"      </p>\r\n" + 
	"      <h5>Fifth header h5</h5>\r\n" + 
	"      <p>\r\n" + 
	"        Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium\r\n" + 
	"        doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore\r\n" + 
	"        veritatis et quasi architecto beatae vitae dicta sunt explicabo. Nemo enim\r\n" + 
	"        ipsam voluptatem quia voluptas sit aspernatur aut odit aut fugit, sed quia\r\n" + 
	"        consequuntur magni dolores eos qui ratione voluptatem sequi nesciunt.\r\n" + 
	"      </p>\r\n" + 
	"      <h6>Sixth header h6</h6>\r\n" + 
	"      <p>\r\n" + 
	"        At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis\r\n" + 
	"        praesentium voluptatum deleniti atque corrupti quos.\r\n" + 
	"      </p>\r\n" + 
	"    </section>\r\n" + 
	"    <hr />\r\n" + 
	"    <section>\r\n" + 
	"      <h1>Links</h1>\r\n" + 
	"      <a href=\"#\">Sample text link</a>\r\n" + 
	"      <a href=\"#\">Sample button link</a>\r\n" + 
	"    </section>\r\n" + 
	"    <hr />\r\n" + 
	"    <section>\r\n" + 
	"      <h1>Lists</h1>\r\n" + 
	"      <h2>Unordered list</h2>\r\n" + 
	"      <ul>\r\n" + 
	"        <li>Orange</li>\r\n" + 
	"        <li>Apple</li>\r\n" + 
	"        <li>Rhubarb</li>\r\n" + 
	"        <li>Rasberry</li>\r\n" + 
	"        <li>Blueberry</li>\r\n" + 
	"        <li>Cherry</li>\r\n" + 
	"      </ul>\r\n" + 
	"      <h2>Ordered list</h2>\r\n" + 
	"      <ol>\r\n" + 
	"        <li>First</li>\r\n" + 
	"        <li>Second</li>\r\n" + 
	"        <li>Third</li>\r\n" + 
	"        <li>Fourth</li>\r\n" + 
	"        <li>Fifth</li>\r\n" + 
	"        <li>Sixth</li>\r\n" + 
	"      </ol>\r\n" + 
	"      <h2>Definition list</h2>\r\n" + 
	"      <dl>\r\n" + 
	"        <dt>\r\n" + 
	"        Kick\r\n" + 
	"        </dt>\r\n" + 
	"        <dd>\r\n" + 
	"        808\r\n" + 
	"        </dd>\r\n" + 
	"        <dt>\r\n" + 
	"        Snare\r\n" + 
	"        </dt>\r\n" + 
	"        <dd>\r\n" + 
	"        909\r\n" + 
	"        </dd>\r\n" + 
	"      </dl>\r\n" + 
	"      <dl>\r\n" + 
	"        <dt> Maine </dt>\r\n" + 
	"        <dd> Augusta </dd>\r\n" + 
	"        <dt> California </dt>\r\n" + 
	"        <dd> Sacremento </dd>\r\n" + 
	"        <dt> Oregon </dt>\r\n" + 
	"        <dd> Salem </dd>\r\n" + 
	"        <dt> New York </dt>\r\n" + 
	"        <dd> Albany </dd>\r\n" + 
	"      </dl>\r\n" + 
	"      <dl>\r\n" + 
	"        <dt> Ascender </dt>\r\n" + 
	"        <dd> The part of certain lowercase letters that extends above the x-height of a font.  </dd>\r\n" + 
	"        <dt> Font </dt>\r\n" + 
	"        <dd> Traditionally, a complete set of characters for one typeface at\r\n" + 
	"        one particular type size. Often used more loosely as a synonym for\r\n" + 
	"        \"typeface\".\r\n" + 
	"        </dd>\r\n" + 
	"        <dt> Golden Section </dt>\r\n" + 
	"        <dd>\r\n" + 
	"        The ideal proportion according to the ancient Greeks. It is visualized as the\r\n" + 
	"        division of a line into two unequal segments in such a way that the ratio of the\r\n" + 
	"        smaller segment to the larger segment is equal to the ratio of the larger to the\r\n" + 
	"        whole. It is usually defined as 21:34, that is, 21/34 and 34/(21+34) both equal\r\n" + 
	"        approximately 0.618. A rectangle whose sides are of this proportion is called a\r\n" + 
	"        \"golden rectangle\". Golden rectangles can be found in the proportions of the\r\n" + 
	"        Parthenon and many medieval manuscripts.\r\n" + 
	"        </dd>\r\n" + 
	"      </dl>\r\n" + 
	"    </section>\r\n" + 
	"\r\n" + 
	"    <section>\r\n" + 
	"      <h1>Forms</h1>\r\n" + 
	"      <form>\r\n" + 
	"        <fieldset>\r\n" + 
	"          <!--\r\n" + 
	"          Every fieldset must contain a legend. IE barfs if it's not there.\r\n" + 
	"          It's no fun.\r\n" + 
	"          -->\r\n" + 
	"          <legend>Legend Example</legend>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label>Text Input Label</label>\r\n" + 
	"            <input type=\"text\" />\r\n" + 
	"            <p>Helper text if necessary.</p>\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label>Password</label>\r\n" + 
	"            <input type=\"password\" />\r\n" + 
	"            <p>Error messages when appropriate.</p>\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label for=\"first-name\">First Name</label>\r\n" + 
	"            <input type=\"text\" id=\"first-name\" />\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label for=\"last-name\">Last Name</label>\r\n" + 
	"            <input type=\"text\" id=\"last-name\" />\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label for=\"email\">Email</label>\r\n" + 
	"            <input type=\"email\" id=\"email\" />\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label for=\"gender\">Dropdown</label>\r\n" + 
	"            <select>\r\n" + 
	"              <option>Option 1</option>\r\n" + 
	"              <option>Option 2</option>\r\n" + 
	"              <option>Option 3</option>\r\n" + 
	"            </select>\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label>Radio Buttons</label>\r\n" + 
	"            <ul>\r\n" + 
	"              <li><label><input type=\"radio\" /> Label 1</label></li>\r\n" + 
	"              <li><label><input type=\"radio\" /> Label 2</label></li>\r\n" + 
	"              <li><label><input type=\"radio\" /> Label 3</label></li>\r\n" + 
	"            </ul>\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label for=\"url\">URL Input</label>\r\n" + 
	"            <input type=\"url\" placeholder=\"http://mrmrs.cc\" />\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label>Text area</label>\r\n" + 
	"            <textarea></textarea>\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <label><input type=\"checkbox\" /> This is a checkbox.</label>\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"          <div>\r\n" + 
	"            <input type=\"submit\" value=\"Submit\" />\r\n" + 
	"          </div>\r\n" + 
	"\r\n" + 
	"        </fieldset>\r\n" + 
	"      </form>\r\n" + 
	"    </section>\r\n" + 
	"    <section>\r\n" + 
	"      <h1>Buttons</h1>\r\n" + 
	"      <button>A button</button>\r\n" + 
	"      <button>A button</button>\r\n" + 
	"      <button>A large button</button>\r\n" + 
	"    </section>\r\n" + 
	"    <hr />\r\n" + 
	"    <section>\r\n" + 
	"      <h1>An Example Article</h1>\r\n" + 
	"      <article>\r\n" + 
	"        <h1>Title</h1>\r\n" + 
	"        <p>\r\n" + 
	"          Lorem ipsum dolor sit amet, <b>consectetur adipisicing elit</b>, sed do eiusmod\r\n" + 
	"          tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,\r\n" + 
	"          quis nostrud <em>exercitation ullamco laboris nisi ut aliquip ex ea commodo\r\n" + 
	"            consequat</em>. Duis aute irure dolor in reprehenderit in voluptate velit esse\r\n" + 
	"          cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat\r\n" + 
	"          non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.\r\n" + 
	"        </p>\r\n" + 
	"        <blockquote>\r\n" + 
	"          <p>\r\n" + 
	"            This is a GREAT pull quote.\r\n" + 
	"          </p>\r\n" + 
	"          <a href=\"#\">- Author</a>\r\n" + 
	"        </blockquote>\r\n" + 
	"        <p>\r\n" + 
	"          Neque porro quisquam est, qui dolorem ipsum quia dolor sit amet,\r\n" + 
	"          consectetur, adipisci velit, sed quia non numquam eius modi tempora incidunt\r\n" + 
	"          ut labore et dolore magnam aliquam quaerat voluptatem. Ut enim ad minima\r\n" + 
	"          veniam, quis nostrum exercitationem ullam corporis suscipit laboriosam, nisi\r\n" + 
	"          ut aliquid ex ea commodi consequatur? Quis autem vel eum iure reprehenderit\r\n" + 
	"          qui in ea voluptate velit esse quam nihil molestiae consequatur, vel illum\r\n" + 
	"          qui dolorem eum fugiat quo voluptas nulla pariatur?\"\r\n" + 
	"        </p>\r\n" + 
	"        <p>\r\n" + 
	"          At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis\r\n" + 
	"          praesentium voluptatum deleniti atque corrupti quos dolores et quas\r\n" + 
	"          molestias excepturi sint occaecati cupiditate non provident, similique sunt\r\n" + 
	"          in culpa qui officia deserunt mollitia animi, id est laborum et dolorum\r\n" + 
	"          fuga. Et harum quidem rerum facilis est et expedita distinctio.\r\n" + 
	"        </p>\r\n" + 
	"      </article>\r\n" + 
	"    </section>\r\n" + 
	"    <hr />\r\n" + 
	"\r\n" + 
	"    <section>\r\n" + 
	"      <h1>Code examples</h1>\r\n" + 
	"      <code>\r\n" + 
	"        <pre>\r\n" + 
	"      sudo ipfw pipe 1 config bw 256KByte/s\r\n" + 
	"      sudo ipfw add 1 pipe 1 src-port 3000\r\n" + 
	"    </pre>\r\n" + 
	"    </code>\r\n" + 
	"  </section>\r\n" + 
	"    <hr />\r\n" + 
	"    <section>\r\n" + 
	"      <h1>Footer</h1>\r\n" + 
	"      <footer>\r\n" + 
	"        <p>Copyright 2013. Made with love by <a href=\"http://mrmrs.cc\" title=\"MRMRS - Designer\">mrmrs</a>.</p>\r\n" + 
	"        <ul>\r\n" + 
	"           <li>\r\n" + 
	"             <a href=\"#\">Home</a>\r\n" + 
	"           </li>\r\n" + 
	"           <li>\r\n" + 
	"             <a href=\"#\">Contact</a>\r\n" + 
	"           </li>\r\n" + 
	"           <li>\r\n" + 
	"             <a href=\"#\">Jobs</a>\r\n" + 
	"           </li>\r\n" + 
	"        </ul>\r\n" + 
	"        <ul>\r\n" + 
	"           <li>\r\n" + 
	"             <a href=\"http://twitter.com\" title=\" on Twitter\">Twitter</a>\r\n" + 
	"           </li>\r\n" + 
	"           <li>\r\n" + 
	"             <a href=\"http://pinterest.com\" title=\" on Pinterest\">Pinterest</a>\r\n" + 
	"           </li>\r\n" + 
	"           <li>\r\n" + 
	"             <a href=\"http://instagram.com\" title=\" on Instagram\">Instagram</a>\r\n" + 
	"           </li>\r\n" + 
	"           <li>\r\n" + 
	"             <a href=\"http://dribbbble.com\" title=\" on Dribbble\">Dribbble</a>\r\n" + 
	"           </li>\r\n" + 
	"           <li>\r\n" + 
	"             <a href=\"http://github.com\" title=\" on Github\">Github</a>\r\n" + 
	"           </li>\r\n" + 
	"        </ul>\r\n" + 
	"      </footer>\r\n" + 
	"    </section>\r\n" + 
	"\r\n" + 
	"  <section>\r\n" + 
	"    <h1>New hawtness</h1>\r\n" + 
	"    <progress value=\"80\" max=\"100\">80 %</progress>\r\n" + 
	"    <p>We are this close to the goal: <meter min=\"0\" max=\"1000\" value=\"824\">$824</meter>.</p>\r\n" + 
	"  </section>\r\n" + 
	"\r\n" + 
	"  <section>\r\n" + 
	"    <header>\r\n" + 
	"      <h1>Random Stuff</h1>\r\n" + 
	"    </header>\r\n" + 
	"    <small>This is for things like copyright info</small>\r\n" + 
	"    <s>Content that isn't accurate or relevant anymore.</s>\r\n" + 
	"    <span>Generic span wrapper</span>\r\n" + 
	"    <abbr>HTML How to meet ladies</abbr>\r\n" + 
	"    <p>This is inline text with <sub>subscript</sub> and <sup>superscript</sup> elements.</p>\r\n" + 
	"    <p>\r\n" + 
	"      <var>f</var>(<var>x</var>) = <var>a</var><sub>0</sub> + <var>a</var><sub>1</sub><var>x</var> +\r\n" + 
	"      <var>a</var><sub>2</sub><var>x</var><sup>2</sup>, where <var>a</var><sup>2</sup> ≠ 0\r\n" + 
	"    </p>\r\n" + 
	"    <time datetime=\"2013-09-07\" pubdate>07 September 2013</time>\r\n" + 
	"  </section>\r\n" + 
	"\r\n" + 
	"  <section>\r\n" + 
	"    <figure>\r\n" + 
	"      <img src=\"http://placekitten.com/g/960/320\" alt=\"Figure Example\">\r\n" + 
	"      <figcaption>\r\n" + 
	"        Photo of the sky at night. Original by <a href=\"http://flickr.com/photos/heyitsadam/\">@mrmrs</a>\r\n" + 
	"      </figcaption>\r\n" + 
	"    </figure>\r\n" + 
	"  </section>\r\n" + 
	"\r\n" + 
	"  <section>\r\n" + 
	"    <!--\r\n" + 
	"    http://www.w3.org/html/wg/drafts/html/master/text-level-semantics.html#the-samp-element\r\n" + 
	"    -->\r\n" + 
	"    <samp>\r\n" + 
	"      <pre>\r\n" + 
	"          /Sites/html master  ☠ ☢\r\n" + 
	"          $  <kbd>ls -gto</kbd>\r\n" + 
	"\r\n" + 
	"          total 104\r\n" + 
	"          -rw-r--r--   1   10779 Jun  5 16:24 index.html\r\n" + 
	"          -rw-r--r--   1    1255 Jun  5 16:00 _config.yml\r\n" + 
	"          drwxr-xr-x  11     374 Jun  5 15:57 _site\r\n" + 
	"          -rw-r--r--   1    1597 Jun  5 14:16 README.md\r\n" + 
	"          drwxr-xr-x   5     170 Jun  5 14:15 _sass\r\n" + 
	"          -rw-r--r--   1     564 Jun  4 15:59 Rakefile\r\n" + 
	"          drwxr-xr-x   6     204 Jun  4 15:59 _includes\r\n" + 
	"          drwxr-xr-x   4     136 Jun  4 15:59 _layouts\r\n" + 
	"          drwxr-xr-x   3     102 Jun  4 15:59 _resources\r\n" + 
	"          drwxr-xr-x   3     102 Jun  4 15:59 css\r\n" + 
	"          -rw-r--r--   1    1977 Jun  4 15:59 favicon.icns\r\n" + 
	"          -rw-r--r--   1    6518 Jun  4 15:59 favicon.ico\r\n" + 
	"          -rw-r--r--   1    1250 Jun  4 15:59 touch-icon-ipad-precomposed.png\r\n" + 
	"          -rw-r--r--   1    2203 Jun  4 15:59 touch-icon-ipad-retina-precomposed.png\r\n" + 
	"          -rw-r--r--   1    1046 Jun  4 15:59 touch-icon-iphone-precomposed.png\r\n" + 
	"          -rw-r--r--   1    1779 Jun  4 15:59 touch-icon-iphone-retina-precomposed.png\r\n" + 
	"        </pre>\r\n" + 
	"      </samp>\r\n" + 
	"    </section>\r\n" + 
	"    <section>\r\n" + 
	"      <h1>Tables</h1>\r\n" + 
	"        <!--\r\n" + 
	"        From the HTML spec (http://www.w3.org/TR/html401/struct/tables.html)\r\n" + 
	"        TFOOT must appear before TBODY within a TABLE definition so that user agents can\r\n" + 
	"        render the foot before receiving all of the (potentially numerous) rows of data.\r\n" + 
	"        The following summarizes which tags are required and which may be omitted:\r\n" + 
	"        The TBODY start tag is always required except when the table contains only one\r\n" + 
	"        table body and no table head or foot sections. The TBODY end tag may always be\r\n" + 
	"        safely omitted.\r\n" + 
	"        The start tags for THEAD and TFOOT are required when the table head and foot sections\r\n" + 
	"        are present respectively, but the corresponding end tags may always be safely\r\n" + 
	"        omitted.\r\n" + 
	"        Conforming user agent parsers must obey these rules for reasons of backward\r\n" + 
	"        compatibility.\r\n" + 
	"        -->\r\n" + 
	"      <table>\r\n" + 
	"        <caption>This is a caption for a table</caption>\r\n" + 
	"        <thead>\r\n" + 
	"          <tr>\r\n" + 
	"            <th>ID</th>\r\n" + 
	"            <th>Name</th>\r\n" + 
	"            <th>Date</th>\r\n" + 
	"            <th>Address</th>\r\n" + 
	"          </tr>\r\n" + 
	"        </thead>\r\n" + 
	"        <tfoot>\r\n" + 
	"          <tr>\r\n" + 
	"            <td>Table footer info</td>\r\n" + 
	"          </tr>\r\n" + 
	"        </tfoot>\r\n" + 
	"        <tbody>\r\n" + 
	"          <tr>\r\n" + 
	"            <td>#999-32ac</td>\r\n" + 
	"            <td>First Name</td>\r\n" + 
	"            <td>13 May, 2013</td>\r\n" + 
	"            <td>999 Spruce Lane, Somewhere, CA 94101</td>\r\n" + 
	"          </tr>\r\n" + 
	"          <tr>\r\n" + 
	"            <td>#888-32dd</td>\r\n" + 
	"            <td>Sample Name</td>\r\n" + 
	"            <td>17 May, 1984</td>\r\n" + 
	"            <td>999 Spruce Lane, Somewhere, CA 94101</td>\r\n" + 
	"          </tr>\r\n" + 
	"        </tbody>\r\n" + 
	"      </table>\r\n" + 
	"    </section>\r\n" + 
	"    <section>\r\n" + 
	"      <h1>Footer</h1>\r\n" + 
	"      <footer>\r\n" + 
	"        <small>© 2014 Some company name</small>\r\n" + 
	"        <address>email@email.com</address>\r\n" + 
	"      </footer>\r\n" + 
	"    </section>\r\n" + 
	"  </body>\r\n" + 
	"</html>";
	

}
