import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class LayoutSwingConMargenes extends JFrame {

    public LayoutSwingConMargenes() {
        setTitle("Maquetación con márgenes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 700);
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(5, 5, 5, 5); // margen entre bloques principales

        // -------- HEADER PRINCIPAL (10%) --------
        JPanel header = new JPanel();
        header.setBackground(new Color(205, 92, 92)); // rojo
        JLabel headerLabel = new JLabel("<Header>");
        headerLabel.setForeground(Color.WHITE);
        header.add(headerLabel);
        gbc.gridx = 0; gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.weightx = 1; gbc.weighty = 0.1;
        add(header, gbc);

        // -------- NAV (10% ancho) --------
        JPanel nav = new JPanel();
        nav.setBackground(new Color(205, 92, 92));
        JLabel navLabel = new JLabel("<Nav>");
        navLabel.setForeground(Color.WHITE);
        nav.add(navLabel);
        gbc.gridx = 0; gbc.gridy = 1;
        gbc.gridwidth = 1;
        gbc.weightx = 0.1; gbc.weighty = 0.8;
        add(nav, gbc);

        // -------- SECTION (80% ancho, subdividido) --------
        JPanel section = new JPanel(new GridBagLayout());
        section.setBackground(new Color(205, 92, 92)); // rojo
        section.setBorder(new EmptyBorder(5, 5, 5, 5)); // margen interno
        GridBagConstraints sec = new GridBagConstraints();
        sec.fill = GridBagConstraints.BOTH;
        sec.insets = new Insets(5, 0, 5, 0); // separación vertical

        // Texto "<Section>" (solo texto blanco arriba del todo)
        JLabel sectionLabel = new JLabel("<Section>", SwingConstants.CENTER);
        sectionLabel.setForeground(Color.WHITE);
        sec.gridx = 0; sec.gridy = 0;
        sec.weightx = 1; sec.weighty = 0.05;
        section.add(sectionLabel, sec);

        // Sub-header (10%)
        JPanel subHeader = new JPanel();
        subHeader.setBackground(new Color(189, 183, 107)); // amarillo
        JLabel subHeaderLabel = new JLabel("<Header>");
        subHeaderLabel.setForeground(Color.WHITE);
        subHeader.add(subHeaderLabel);
        sec.gridx = 0; sec.gridy = 1;
        sec.weightx = 1; sec.weighty = 0.1;
        section.add(subHeader, sec);

        // Article (70%)
        JPanel article = new JPanel();
        article.setBackground(new Color(189, 183, 107));
        JLabel articleLabel = new JLabel("<Article>");
        articleLabel.setForeground(Color.WHITE);
        article.add(articleLabel);
        sec.gridx = 0; sec.gridy = 2;
        sec.weightx = 1; sec.weighty = 0.7;
        section.add(article, sec);

        // Sub-footer (10%)
        JPanel subFooter = new JPanel();
        subFooter.setBackground(new Color(189, 183, 107));
        JLabel subFooterLabel = new JLabel("<Footer>");
        subFooterLabel.setForeground(Color.WHITE);
        subFooter.add(subFooterLabel);
        sec.gridx = 0; sec.gridy = 3;
        sec.weightx = 1; sec.weighty = 0.1;
        section.add(subFooter, sec);

        gbc.gridx = 1; gbc.gridy = 1;
        gbc.weightx = 0.8; gbc.weighty = 0.8;
        add(section, gbc);

        // -------- ASIDE (10% ancho) --------
        JPanel aside = new JPanel();
        aside.setBackground(new Color(205, 92, 92));
        JLabel asideLabel = new JLabel("<Aside>");
        asideLabel.setForeground(Color.WHITE);
        aside.add(asideLabel);
        gbc.gridx = 2; gbc.gridy = 1;
        gbc.weightx = 0.1; gbc.weighty = 0.8;
        add(aside, gbc);

        // -------- FOOTER PRINCIPAL (10%) --------
        JPanel footer = new JPanel();
        footer.setBackground(new Color(205, 92, 92));
        JLabel footerLabel = new JLabel("<Footer>");
        footerLabel.setForeground(Color.WHITE);
        footer.add(footerLabel);
        gbc.gridx = 0; gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.weightx = 1; gbc.weighty = 0.1;
        add(footer, gbc);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(LayoutSwingConMargenes::new);
    }
}
