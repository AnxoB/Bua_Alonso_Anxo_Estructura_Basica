import javax.swing.*;
import java.awt.*;

public class EstructuraBasicaWeb extends JFrame {

    public EstructuraBasicaWeb() {
        setTitle("Maquetación Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLayout(new BorderLayout(5, 5)); // separaciones entre paneles

        // ---------- HEADER PRINCIPAL ----------
        JPanel header = new JPanel();
        header.setBackground(new Color(205, 92, 92)); // #CD5C5C
        header.add(new JLabel("<Header>", SwingConstants.CENTER));
        add(header, BorderLayout.NORTH);

        // ---------- FOOTER PRINCIPAL ----------
        JPanel footer = new JPanel();
        footer.setBackground(new Color(205, 92, 92));
        footer.add(new JLabel("<Footer>", SwingConstants.CENTER));
        add(footer, BorderLayout.SOUTH);

        // ---------- NAV (IZQUIERDA) ----------
        JPanel nav = new JPanel();
        nav.setBackground(new Color(205, 92, 92));
        nav.add(new JLabel("<Nav>", SwingConstants.CENTER));
        add(nav, BorderLayout.WEST);

        // ---------- ASIDE (DERECHA) ----------
        JPanel aside = new JPanel();
        aside.setBackground(new Color(205, 92, 92));
        aside.add(new JLabel("<Aside>", SwingConstants.CENTER));
        add(aside, BorderLayout.EAST);

        // ---------- SECTION (CENTRO) ----------
        JPanel section = new JPanel();
        section.setLayout(new BorderLayout(5, 5));
        section.setBackground(new Color(205, 92, 92));
        section.add(new JLabel("<Section>", SwingConstants.CENTER), BorderLayout.NORTH);

        // Sub-header
        JPanel subHeader = new JPanel();
        subHeader.setBackground(new Color(189, 183, 107)); // #BDB76B
        subHeader.add(new JLabel("<Header>", SwingConstants.CENTER));
        section.add(subHeader, BorderLayout.PAGE_START);

        // Article
        JPanel article = new JPanel();
        article.setBackground(new Color(189, 183, 107));
        article.add(new JLabel("<Article>", SwingConstants.CENTER));
        section.add(article, BorderLayout.CENTER);

        // Sub-footer
        JPanel subFooter = new JPanel();
        subFooter.setBackground(new Color(189, 183, 107));
        subFooter.add(new JLabel("<Footer>", SwingConstants.CENTER));
        section.add(subFooter, BorderLayout.SOUTH);

        add(section, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(EstructuraBasicaWeb::new);
    }
}
